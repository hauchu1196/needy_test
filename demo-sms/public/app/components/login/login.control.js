app.controller('LoginCtr', ["$localStorage", "$scope", "$state", "ToastService", "LoginService",
    function ($localStorage, $scope, $state, ToastService, LoginService) {
        $scope.login = function () {
            var data = {
                username: $scope.username,
                password: $scope.password
            };
            console.log('login', data);
            LoginService.login(data).then(function (res) {
                console.log(res);
            }, function (err) {
                console.log(err);
            })

        }
    }
])