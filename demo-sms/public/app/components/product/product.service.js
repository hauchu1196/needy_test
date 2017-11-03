app.service('ProductService', ['$q', '$http', 'SERVER',
    function ($q, $http, SERVER) {
        this.getAllProduct = function () {
            var deferred = $q.defer();
            $http({
                url: SERVER + '/api/product',
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