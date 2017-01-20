(function () {

    const dbRefQE = firebase.database().ref().child('QE');

    const textField = document.getElementById('QE');

    textField.addEventListener('input', e => {
        console.log(textField.value);
        dbRefQE.set(textField.value);
        });

    dbRefQE.on('value', snap => {
        console.log(snap.val());
        textField.value = snap.val();
    })
}());