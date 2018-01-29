<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<title>회원관리</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>회원 등록</h1>
<form action="add" method='post' enctype="multipart/form-data">

<div class='form-group row'>
<label for='email' class='col-sm-2 col-form-label'>이메일</label>
<div class='col-sm-10'>
<input class='form-control' id='email' type='text' name='email'>
</div>
</div>

<div class='form-group row'>
<label for='password' class='col-sm-2 col-form-label'>암호</label>
<div class='col-sm-10'>
<input class='form-control' id='password' type='password' name='password'>
</div>
</div>

<p>가입 유형</p>
<div class="custom-control custom-radio custom-control-inline">
  <input type="radio" id="type1" name="type" class="custom-control-input" value="일반회원" checked="checked">
  <label class="custom-control-label" for="type1">일반회원</label>
</div>
<div class="custom-control custom-radio custom-control-inline">
  <input type="radio" id="type2" name="type" class="custom-control-input" value="아티스트" checked="checked">
  <label class="custom-control-label" for="type2">아티스트</label>
</div>

<div class='form-group row'>
<label for='nickName' class='col-sm-2 col-form-label'>닉네임</label>
<div class='col-sm-10'>
<input class='form-control' id='nickName' type='text' name='nickName'>
</div>
</div>

<p>메시지 수신 여부</p>
<div class="custom-control custom-radio custom-control-inline">
  <input type="radio" id="messageFlag1" name="messageFlag" class="custom-control-input" value="1" checked="checked">
  <label class="custom-control-label" for="messageFlag1">메세지 수신 동의</label>
</div>
<div class="custom-control custom-radio custom-control-inline">
  <input type="radio" id="messageFlag2" name="messageFlag" class="custom-control-input" value="2">
  <label class="custom-control-label" for="messageFlag2">메세지 수신 거부</label>
</div>


<div class='form-group row'>
<label for='msgid' class='col-sm-2 col-form-label'>메세지 수신 ID</label>
<div class='col-sm-10'>
<input class='form-control' id='msgid' type='text' name='msgid'>
</div>
</div>

<div class="custom-control custom-checkbox">
  <input type="checkbox" class="custom-control-input" id="cancelFlag" name="cancelFlag" value="1">
  <label class="custom-control-label" for="cancelFlag">회원 해지</label>
</div>

<div class='form-group row'>
<label for='file1' class='col-sm-2 col-form-label'>사진</label>
<div class='col-sm-10'>
<input type="file" class="form-control-file" id="file1" name="file">
</div>
</div>

<div class='form-group row'>
<div class='col-sm-10'>
<button class='btn btn-primary btn-sm'>등록</button>
</div>
</div>
</form>

<jsp:include page="../footer.jsp"/>

</div>

<jsp:include page="../jslib.jsp"/>

</body>
</html>
