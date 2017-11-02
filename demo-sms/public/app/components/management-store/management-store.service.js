app.service('ManagementStoreService', ['$q', '$http', 'SERVER',
    function ($q, $http, SERVER) {
        this.getAllStore = function () {
            var deferred = $q.defer();
            $http({
                url: SERVER + '/api/store',
                method: 'GET',
            }).then(function (res) {
                deferred.resolve(res);
            }, function (err) {
                deferred.reject(err);
            })
            return deferred.promise;
        }
    }
])