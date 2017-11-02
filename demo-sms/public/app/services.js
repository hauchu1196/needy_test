app.service('ToastService', function () {
    this.show = function (type, message) {
        if (type == "SUCCESS") {
            $.jGrowl(message, { sticky: false, theme: 'growl-success', position: "bottom-left" });
        } else if (type == "ERROR") {
            $.jGrowl(message, { sticky: false, theme: 'growl-error', position: "bottom-left" });
        } else if (type == "WARNING") {
            $.jGrowl(message, { sticky: false, theme: 'growl-warning', position: "bottom-left" });
        } else {
            $.jGrowl(message, { sticky: false, theme: 'growl-info', position: "bottom-left" });
        }
    }
});