<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>회원 상세 정보</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h3>회원 상세 정보</h3>

<c:if test="${not empty member}">
        <form action='update' method='post' enctype="multipart/form-data">
        
        <div class='form-group row'>
        <label for='no' class='col-sm-2 col-form-label'>번호</label>
        <div class='col-sm-10'>
        <input class='form-control' readonly id='no' type='number' 
                name='no' value='${member.no}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='email' class='col-sm-2 col-form-label'>이메일</label>
        <div class='col-sm-10'>
        <input class='form-control' id='email' type='text' 
                name='email' value='${member.email}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='password' class='col-sm-2 col-form-label'>비밀번호 변경</label>
        <div class='col-sm-10'>
        <input class='form-control' id='password' type='text' 
               name='password' value='${member.password}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='nickName' class='col-sm-2 col-form-label'>닉네임</label>
        <div class='col-sm-10'>
        <input class='form-control' id='nickName' type='text' 
                name='nickName' value='${member.nickName}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='types' class='col-sm-2 col-form-label'>가입유형</label>
        <div class='col-sm-10'>
        <div class="custom-control custom-radio custom-control-inline">
          <input type="radio" id="type1" name="type" class="custom-control-input" 
                 value="일반회원" ${member.type == '일반회원' ? 'checked' :''}>
          <label class="custom-control-label" for="type1">일반회원</label>
        </div>
        <div class="custom-control custom-radio custom-control-inline">
          <input type="radio" id="type2" name="type" class="custom-control-input" 
                 value="아티스트" ${member.type == '아티스트' ? 'checked' :''}>
          <label class="custom-control-label" for="type2">아티스트</label>
        </div>
        </div>
        </div>

        <div class='form-group row'>
        <label for='nickName' class='col-sm-2 col-form-label'>아티스트명</label>
        <div class='col-sm-10'>
        <input class='form-control' id='artistName' type='text' 
               name='artistName' value="${member.artist.artistName}">
        </div>
        </div>

        <div class='form-group row'>
        <label for='nickName' class='col-sm-2 col-form-label'>구성원</label>
        <div class='col-sm-10'>
        <input class='form-control' id='artistMember' type='text' 
               name='artistMember' value="${member.artist.artistMember}">
        </div>
        </div>

        <div class='form-group row'>
        <label for='nickName' class='col-sm-2 col-form-label'>팀 결성일</label>
        <div class='col-sm-10'>
        <input class='form-control' id='joinDate' type='date' 
               name='joinDate' value="${member.artist.joinDate}">
        </div>
        </div>

        <div class='form-group row'>
        <label for='nickName' class='col-sm-2 col-form-label'>프로필</label>
        <div class='col-sm-10'>
        <textarea class='form-control' id='profile' name='profile' >${member.artist.profile}</textarea>
        </div>
        </div>

        <div class='form-group row'>
        <label for='nickName' class='col-sm-2 col-form-label'>메시지 수신 여부</label>
        <div class='col-sm-10'>
        <div class="custom-control custom-radio custom-control-inline">
          <input type="radio" id="messageFlag1" name="messageFlag" class="custom-control-input" 
                 value="1" ${member.messageFlag == '1' ? 'checked' :''}>
          <label class="custom-control-label" for="messageFlag1">메세지 수신 동의</label>
        </div>
        <div class="custom-control custom-radio custom-control-inline">
          <input type="radio" id="messageFlag2" name="messageFlag" class="custom-control-input" 
                 value="2" ${member.messageFlag == '2' ? 'checked' :''}>
          <label class="custom-control-label" for="messageFlag2">메세지 수신 거부</label>
        </div>
        </div>
        </div>

        <div class='form-group row'>
        <label for='msgid' class='col-sm-2 col-form-label'>메세지 수신 ID</label>
        <div class='col-sm-10'>
        <input class='form-control' id='messageId' type='text' 
               name='messageId'  value='${member.messageId}'>
        </div>
        </div>

        <div class="custom-control custom-checkbox">
        <input type="checkbox" class="custom-control-input" id="cancelFlag" 
               name="cancelFlag" value="1" ${member.cancelFlag == '1' ? 'checked' :''}>
        <label class="custom-control-label" for="cancelFlag">회원 해지</label>
        </div>

        <div class='form-group row'>
        <label for='file1' class='col-sm-2 col-form-label'>사진</label>
        <div class='col-sm-10'>
        <input type="file" class="form-control-file" id="file1" name="file">
        </div>
        </div>

        
        <div class='form-group row'>
        <label for='regdate' class='col-sm-2 col-form-label'>등록일</label>
        <div class='col-sm-10'>
        <input class='form-control' readonly id='regdate' type='date' 
                value='${member.regDate}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <div class='col-sm-10'>
        <button class='btn btn-primary btn-sm'>변경</button>
        <a href='delete?no=${member.no}' class='btn btn-primary btn-sm'>삭제</a>
        </div>
        </div>
        </form>
</c:if>
<c:if test="${empty member}">
        <p>'${param.no}'번 회원 정보가 없습니다.</p>
</c:if>

<jsp:include page="../footer.jsp"/>

</div>

<jsp:include page="../jslib.jsp"/>

</body>
</html>
    