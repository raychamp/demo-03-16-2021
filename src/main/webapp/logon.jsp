<!DOCTYPE html>
<html ng-app="exampleApp">
<head>
    <title>Services and Modules</title>
    <script src="../js/angular.js"></script>
    <link href="../js/bootstrap.css" rel="stylesheet" />
    <link href="../js/bootstrap-theme.css" rel="stylesheet" />
    <script>
        angular.module("exampleApp", [])
        .controller("defaultCtrl", function ($scope) {
            $scope.data = {
                cities: ["London", "New York", "Paris"],
                totalClicks: 0
            };

            $scope.$watch('data.totalClicks', function (newVal) {
                console.log("Total click count: " + newVal);
            });
        })
        .directive("triButton", function () {
            return {
                scope: { counter: "=counter" },
                link: function (scope, element, attrs) {
                    element.on("click", function (event) {
                        console.log("Button click: " + event.target.innerText);
                        scope.$apply(function () {
                            scope.counter++;
                        });
                    });
                }
            }
        });
    </script>
</head>
<body ng-controller="defaultCtrl">
    <div class="well">
        <div class="btn-group" tri-button
             counter="data.totalClicks" source="data.cities">
            <button type="button" class="btn btn-primary"
                    ng-repeat="city in data.cities">
                {{city}}
            </button>
        </div>
        <h5>Total Clicks: {{data.totalClicks}}</h5>
    </div>
</body>
</html>
