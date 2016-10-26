new Clipboard('.BOOM-btn');
var vueApp = new Vue({
    el: '#app',
    data: {
        activity: '',
        assignment: '',
        lesson: '',
        numberArray: ['','one','two','three','four','five','six','seven','eight','nine'],
        answers: answerKey
    },
    methods: {
        matchName: function (name) {
            var regexConstructor = "";
            if (this.lesson) {
                regexConstructor += "lesson_" + this.lesson + "_"
            }
            if (this.activity) {
                regexConstructor += "activity_" + this.numberArray[this.activity]
            }
            if (this.assignment) {
                regexConstructor = "asm_" + this.assignment
            }
            return name.match(regexConstructor)
        }
    }
});
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
$(document).ready(function () {
    if (localStorage.getItem("agreed")) {
    } else {
        modalPrompt()
    }
    $("#tnc").on('hidden.bs.modal', function (e) {
        modalPrompt()
    });
    $(".modal button.btn.btn-primary").on('click', function () {
        localStorage.setItem('agreed', 'true');
    })
})