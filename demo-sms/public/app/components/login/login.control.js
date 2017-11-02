app.controller('LoginCtr', ["$localStorage", "$scope", "$state", "ToastService", "LoginService",
    function ($localStorage, $scope, $state, ToastService, LoginService) {
        $scope.login = function () {
            var data = {
                username: $scope.username,
                password: $scope.password
            };
            console.log('login', data);
            LoginService.login(data).then(function (res) {
                if (res.data.code === 200) {
                    $state.go("page.home");
                } else {
                    ToastService.show("WARNING", 'Đăng nhập thất bại');
                }
            }, function (err) {
                alert("Đăng nhập thất bại");
            })

        }
    }
])