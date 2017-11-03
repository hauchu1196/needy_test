app.controller('ProductCtr', ['$scope', 'ProductService', '$q',
    function ($scope, ProductService, $q) {

        function init() {
            var promises = [];
            promises.push(ProductService.getAllProduct().then(function (res) {
                $scope.products = res.data;
            }, function (err) {
                console.log(err);
            }))

            $q.all(promises).then(function () {

            })
        }
        init();
    }
])