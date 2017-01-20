var clipboard = new Clipboard('.BOOM-btn');

var titleStr = "▁▂▃▄▅▆▇█▇▆▅▄▃▂▁";
var titleLen = titleStr.length;
setInterval(function () {
    document.title = titleStr;
    titleStr = (titleStr + titleStr[0]).substr(1)
},100);

var modalPrompt = function () {
        if (typeof(Storage) !== "undefined") {
            if (localStorage.getItem("agreed") == null) {
                $('#tnc').modal('show')
            }
        }
};
var signIn = $('#sign-in');
var signOut = $('#sign-out');
$(document).ready(function () {
    if (localStorage.getItem("agreed")) {
    } else {
        modalPrompt()
    }
    clipboard.on('success', e=> {
        document.querySelector('#snackbar').MaterialSnackbar.showSnackbar({message: "Copied!!!"});
    })
    $("#tnc").on('hidden.bs.modal', function (e) {
        modalPrompt()
    });
    $(".modal button.btn.btn-primary").on('click', function () {
        localStorage.setItem('agreed', 'true');
    });
    signOut.click(e => {
        firebase.auth().signOut();
    });
    if (window.location.href.match(/\?mode=select/)) {
        $("#login").modal('show');
    }
});
firebase.auth().onAuthStateChanged(function(user) {
    if (user) {
        signIn.addClass('hide');
        signOut.removeClass('hide');
    } else {
        signIn.removeClass('hide');
        signOut.addClass('hide')
    }
});