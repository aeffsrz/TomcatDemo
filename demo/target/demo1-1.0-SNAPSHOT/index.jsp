<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        .container {
            margin-top: 50px;
            text-align: center;
        }
        .error {
            color: red;
            font-size: 1.2em;
            font-style: italic;
        }
        .result {
            font-weight: bold;
            color: #007bff;
        }
    </style>
</head>
<body>
<div class="container">
    <h1 class="text-center">Compound Interest Calculator</h1>

    <form action="CalculatorServlet" method="post">
        <div class="form-group">
            <label>Principle Amount:</label>
            <input type="text" name="principleAmount" class="form-control">
        </div>
        <div class="form-group">
            <label>Interest Rate (%):</label>
            <input type="text" name="interest" class="form-control">
        </div>
        <div class="form-group">
            <label>Years:</label>
            <input type="text" name="years" class="form-control">
        </div>
        <div class="form-group">
            <label>Compounding Period:</label>
            <input type="text" name="compoundingPeriod" class="form-control">
        </div>
        <button type="submit" class="btn btn-primary mx-auto d-block">Calculate</button>
    </form>

    <hr>

    <c:if test="${not empty error}">
        <p class="error">${error}</p>
    </c:if>

    <c:if test="${not empty result}">
        <p class="result">Result: ${result}</p>
        <p>Principle Amount: ${principleAmount}</p>
        <p>Interest Rate: ${interest}</p>
        <p>Years: ${years}</p>
        <p>Compounding Period: ${compoundingPeriod}</p>
    </c:if>
</div>
</body>
</html>
