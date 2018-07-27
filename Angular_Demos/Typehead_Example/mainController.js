angular.module('myApp', ['ui.bootstrap'])
    .controller("mainCtrl", function ($scope) {
    $scope.selected = '';
    $scope.states = [{id:1,postcode:'411046',address:'Katraj'},
    				{id:2,postcode:'412205',address:'Bhor'},
    				{id:3,postcode:'412206',address:'Saswad'},
    				{id:4,postcode:'412207',address:'Shirwal'},
    				{id:5,postcode:'412208',address:'Mulashi'}];
    
     $scope.setPcode = function(site) {
      $scope.setPincode = site.postcode;
  		$scope.setId = site.id;
  	};
});
