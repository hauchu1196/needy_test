app.service('LoginService', function ($q, $http, $rootScope,$cookies, SERVER) {
    console.log(SERVER);
    this.login = function (data) {
        var deferred = $q.defer();
        $http({
            url: SERVER + '/login',
            method: 'POST',
            data: JSON.stringify(data),
            headers : {
                'Content-Type' : 'application/json'
            },
        }).then(function (res) {
            deferred.resolve(res);
        }, function (err) {
            deferred.reject(err);
        })
        return deferred.promise;
    }, this.logout = function () {

    }, this.setAccessToken = function (accessToken) {
        $rootScope.globals = {
            access_token: accessToken
        };

        // set default auth header for http requests
        $http.defaults.headers.common['Authorization'] = accessToken;

        var cookieExp = new Date();
        cookieExp.setDate(cookieExp.getDate() + 7);
        $cookies.putObject('globals', $rootScope.globals, { expires: cookieExp });
    }, this.clearAccessToken = function () {
        $rootScope.globals = {};
        $cookies.remove('globals');
        $http.defaults.headers.common.Authorization = '';
    }
})