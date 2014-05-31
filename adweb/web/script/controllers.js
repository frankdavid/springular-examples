app.controller('HomeController', ['$scope', 'Remote', function ($scope, Remote) {
    $scope.ads = Remote.AdService.findHomeAds(20);

    $scope.onlineUsers = Remote.UserService.getOnlineUsers();

    $scope.findAd = function(term) {
        $scope.results = Remote.AdService.findByName(term);
    }

}]);

