<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="static/css/Style.css">
    <title>Document</title>
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<div role="navigation">
    <div class="navbar navbar-inverse">
        <a href="#" class="navbar-brand">bootstrap</a>
        <div class="navbar collapse-nav">
            <ul class=" nav navbar-nav">
                <li><a href="#">Manage Task</a></li>
                <li><a href="#">All Tasks</a></li>
            </ul>
        </div>
        <div class="container invisible-at-first" id="homeDiv">
            <div class="jumbotron text-center">
                <h1>Welcome to Task Manager</h1>
            </div>
        </div>
    </div>
        <div class="container text-center " id="tasksDiv">
            <h3> My Tasks</h3>
            <br>
            <div class="table-responsive">

                 <table class=" table table-striped table-bordered text-left">
                     <thead>
                     <tr>
                         <th>Id</th>
                         <th>Name</th>
                         <th>Description</th>
                         <th>Date Created</th>
                         <th>Finished</th>
                     </tr>
                     </thead>
                     <tbody>
                        <c:forEach var="task" items="${tasks}">
                            <tr>
                                <td>${task.id}</td>
                                <td>${task.name}</td>
                                <td>${task.description}</td>
                                <td>${task.dateCreated}</td>
                                <td>${task.finished}</td>
                            </tr>

                        </c:forEach>


                     </tbody>

                 </table>
            </div>
        </div>
    </div>


</body>
<h1 class="col">hafagef</h1>
</html>

