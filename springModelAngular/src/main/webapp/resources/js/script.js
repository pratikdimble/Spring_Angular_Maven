//<reference path ="resources/js/angular.min.js"/>
var app=angular
	.module("myModule",[])
	.controller("myController",function($scope){
		var employees=[
				{name:"Pratik",gender:"Male",salary:40000,dob:new Date("October 04 1992")},
				{name:"Snehal",gender:"Female",salary:50000,dob:new Date("May 02 1993")},
				{name:"Rohit",gender:"Male",salary:30000,dob:new Date("April 14 1990")}
		]
		$scope.employees=employees;
		$scope.reverseSort= false; 
		$scope.sortColumn="name";
			//sortData() starts
			$scope.sortData=function(column){
				$scope.reverseSort=($scope.sortColumn==column) ? !$scope.reverseSort:false;
				$scope.sortColumn=column;
			}	//sortData() close---------->>>> getSortClass() starts
			$scope.getSortClass=function(column){
				if($scope.sortColumn==column){
					return $scope.reverseSort ? 'arrow-down' : 'arrow-up'
				}
				return '';
			} 		//getSortClass() close
	});