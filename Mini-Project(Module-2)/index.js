function Solve(val) {
    var v = document.getElementById('res');
    v.value += val;
}

function Result() {
    var num1 = document.getElementById('res').value;
    try {
        var num2 = eval(num1.replace(/x/g, '*').replace(/%/g, '/100*'));
        document.getElementById('res').value = num2;
    } catch {
        document.getElementById('res').value = 'Error';
    }
}

function Clear() {
    var inp = document.getElementById('res');
    inp.value = '';
}

function Backspace() {
    var ev = document.getElementById('res');
    ev.value = ev.value.slice(0, -1);
}

function SquareRoot() {
    let display = document.getElementById("res");
    let currentValue = parseFloat(display.value);
    if (isNaN(currentValue)) {
        display.value = "Error"; 
        return;
    }
    if (currentValue < 0) {
        display.value = "Error";
        return;
    }
    let result = Math.sqrt(currentValue);    
    display.value = result;
}

document.addEventListener('keydown', function (event) {
    const key = event.key;
    const validKeys = '0123456789+-*/.%'; 
    
    if (validKeys.includes(key)) {
      Solve(key === '*' ? 'x' : key); 
    } 
    else if (key === 'Enter' || key === '=') {
      Result();
    } 
    else if (key === 'Backspace') {
      Backspace();
    } 
    else if (key.toLowerCase() === 'c') {
      Clear();
    }
});