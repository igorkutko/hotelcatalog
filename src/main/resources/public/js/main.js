var app = angular.module("HotelCatalogDemo", []);

app.controller("AppCtrl", function ($scope, $http) {
    $scope.hotels=[];

    $http.get("/").then(function(response) {
        $scope.hotels = response.data;
    });

});