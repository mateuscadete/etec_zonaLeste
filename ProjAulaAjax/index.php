<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
        let onFetchMainPhpCompleted = (response) =>{
            console.log(response.text().then((data) => {
                window.document.getElementById('result').innerText = data;
            }));

        }

        let OnBtnClickFunction = () => {
            fetch('./main.php').then(onFetchMainPhpCompleted);

        }

        let myOnloadFunction = () => {
            window.document.getElementById('btn').addEventListener('click' , OnBtnClickFunction)

        }

        window.onload = myOnloadFunction;
        
    </script>
</head>

<body>
    <h1>Hello Word</h1>
    <button id="btn">Click Me</button>
    <span id="result"></span>
</body>

</html>