app.controller('ManagementStoreCtr', ['$scope', 'ManagementStoreService', '$q',
    function ($scope, ManagementStoreService, $q) {

        init = function () {
            var promises = [];

            promises.push(ManagementStoreService.getAllStore().then(function (res) {
                console.log(res);
                $scope.stores = res.data;
            }, function (err) {
                console.log(err);
            }))
            $q.all(promises).then(function () {

            })
        }
        init();
    }
])