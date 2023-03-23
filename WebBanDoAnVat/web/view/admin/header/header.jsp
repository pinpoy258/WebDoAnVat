<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:url value = "/view/admin/assets" var="url"/>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <meta name="description" content="" />
  <meta name="author" content="" />
  <title>Trang Admin</title>

  <link href="${url}/css/pace.min.css" rel="stylesheet" />
  <script src="${url}/js/pace.min.js"></script>
  <link rel="stylesheet" href="${url}/plugins/summernote/dist/summernote-bs4.css"/>
  <link rel="icon" href="${url}/images/favicon.ico" type="image/x-icon">
  <link href="${url}/plugins/vectormap/jquery-jvectormap-2.0.2.css" rel="stylesheet" />
  <link href="${url}/plugins/simplebar/css/simplebar.css" rel="stylesheet" />
  <link href="${url}/css/bootstrap.min.css" rel="stylesheet" />
  <link href="${url}/css/animate.css" rel="stylesheet" type="text/css" />
  <link href="${url}/css/icons.css" rel="stylesheet" type="text/css" />
  <link href="${url}/css/sidebar-menu.css" rel="stylesheet" />
  <link href="${url}/css/app-style.css" rel="stylesheet" />
  

</head>

<body class="bg-theme bg-theme1">


 
  
 
  <jsp:include page = "./left-sidebar.jsp" flush = "true" />
  
  