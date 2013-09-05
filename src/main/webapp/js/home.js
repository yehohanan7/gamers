//noinspection JSUnresolvedVariable,JSCheckFunctionSignatures
angular.module('home', []).
  directive('carousel', function () {
    return {
      restrict: 'E',
      transclude: true,
      scope: {},
      controller: function ($scope, $element) {
        $scope.select = function (pane) {

        }
      },
      template: '<div>carousels</div>',
      replace: true
    };
  })