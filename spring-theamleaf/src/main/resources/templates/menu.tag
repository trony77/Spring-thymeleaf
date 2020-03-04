
<!doctype html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">

    <title>Welcome to DD'S fondation</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>

<body>

<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom box-shadow">
    <h5 class="my-0 mr-md-auto font-weight-normal text-primary" th:text="${logo}"></h5>
    <nav class="my-2 my-md-0 mr-md-3">
        <a class="p-2 text-dark"  th:text="${professionnal}" href="#">..</a>
        <a class="p-2 text-dark"  th:text="${particulary}" href="#"></a>
        <a class="p-2 text-dark"   th:text="${publicadministration}" href="#"></a>
        <a class="p-2 text-dark" href="#">Simulations</a>
    </nav>
    <a class="btn btn-outline-primary"  th:text="${signup}" href="#"></a>
</div>

</body>
</html>
