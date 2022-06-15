<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<header>
    <nav>
        <ul class="navbar-nav">
            <li><a href="listphone.jsp" class="nav-link">List</a></li>

        </ul>
    </nav>
</header>

<div class="container col-md-5">
    <div class="card">
        <div class="card-body">
            <form action="home" method="post">
                <fieldset class="form-group">
                    <label>Name</label>
                    <input type="text" class="form-control" name="name" required>
                </fieldset>

                <fieldset class="form-group">
                    <label>Brand</label>
                    <input type="text" class="form-control" name="brand" required>
                </fieldset>

                <fieldset class="form-group">
                    <label>Price</label>
                    <input type="text"
                           class="form-control" name="price"
                           required>
                </fieldset>

                <fieldset class="form-group">
                    <label>Description</label>
                    <input type="text"
                           class="form-control" name="description"
                           required>
                </fieldset>

            <button type="submit" class="btn btn-success">Save</button>

            <button type="reset" class="btn btn-success">Reset</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>