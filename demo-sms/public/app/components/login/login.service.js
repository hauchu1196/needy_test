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

    }
})