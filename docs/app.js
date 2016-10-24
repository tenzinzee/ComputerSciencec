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
var titleLen = titleStr.length
setInterval(function () {
    document.title = titleStr
    titleStr = (titleStr + titleStr[0]).substr(1)
},100);