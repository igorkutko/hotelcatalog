var app = angular.module("HotelCatalogDemo", []);

app.controller("AppCtrl", function ($scope, $http) {
    $scope.hotels=[];

    $http.get('http://localhost:8099/hotels').success(function(response) {
        $scope.hotels = response.data;
    });

});