app.config(['$stateProvider', '$urlRouterProvider', '$locationProvider',
    function ($stateProvider, $urlRouterProvider, $locationProvider) {
        $urlRouterProvider.otherwise('/');

        $stateProvider.state('page', {
            abstract: true,
            url: '/page',
            templateUrl: '/app/shared/page.html'
        }).state('page.home', {
            url: '/home',
            templateUrl: '/app/components/home/home.view.html',
        }).state('login', {
            url: '/login',
            controller: 'LoginCtr',
            templateUrl: '/app/components/login/login.view.html'
        })

        $locationProvider.html5Mode(true);

    }
])