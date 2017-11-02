var app = angular.module('app', [
    'ui.router',
    'ngCookies',
    'ui.bootstrap',
    'ngStorage',
])

app.constant('SERVER', 'http://localhost:8080');

app.run(function ($rootScope, $state, $location, $cookies, $http, $window, LoginService, SERVER) {
    console.log(SERVER);

    angular.isUndefinedOrNull = function (val) {
        return angular.isUndefined(val) || val === null
    };

    $rootScope.globals = $cookies.getObject('globals') || {};
    if ($rootScope.globals.access_token) {
        $http.defaults.headers.common['Authorization'] = $rootScope.globals.access_token;
    }

    $rootScope.$on('$locationChangeStart', function (event, next, current, AuthenticationService) {
        var restrictedPage = $.inArray($location.path(), ['/login']) === -1;
        console.log(restrictedPage);
        if (restrictedPage) {
            // $location.path('/page/home');
        } else {
            // $location.path('/page/home');
        }

    })
})