app.controller('NavbarCtr', ['$scope', 'LoginService', '$state',
    function ($scope, LoginService, $state) {
        $scope.logout = function () {
            LoginService.clearAccessToken();
            $state.go("login");
        }
    }
])