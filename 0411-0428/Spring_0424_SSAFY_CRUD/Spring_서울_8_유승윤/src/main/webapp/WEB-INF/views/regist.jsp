<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>사용자 정보 입력</title>
  </head>
  <body>
    <%@ include file="include/header.jsp"%>
    <main>
    <h1>사용자 정보를 입력해요.</h1>
    	<div class="menus">
		<a href="./index" class="btn">홈으로</a>
		</div>
    <div class="user_regist-wrapper">
      <form method="post" action="regist" enctype="multipart/form-data">
		<div class="regist_input">
		  <label for="id"><strong>ID</strong></label>
          <input type="text" id="id" name="id" /><br />
		</div>
		<div class="regist_input">
          <label for="password"><strong>PASSWORD</strong></label>
          <input type="password" id="password" name="password" /><br />
		</div>
		<div class="regist_input">
          <label for="name"><strong>NAME</strong></label>
          <input type="text" id="name" name="name" /><br />
		</div>
		<div class="regist_input">          
          <label for="email"><strong>EMAIL</strong></label>
          <input type="email" id="email" name="email" /><br />
		</div>
		<div class="regist_input">          
          <label for="age"><strong>AGE</strong></label>
          <input type="number" id="age" name="age" /><br />
        </div>
          <div class="regist_input">
            <label for="file"><strong>PROFILE</strong></label>
            <input
              type="file"
              id="file"
              name="file"
              class="input-image"
              accept="image/*"
            />
          </div>
          <div class="regist_input">
          <label for="department_code"><strong>SELECT DEPT.</strong></label>
          <select id="department_code" name="department_code">
            <option value="100">사진부</option>
            <option value="200">방송부</option>
            <option value="300">영화부</option>
            <option value="400">밴드부</option>
          </select>
          </div>
          <div class="regist_input_btns">
          <input type="submit" value="등록" />
          </div>
      </form>
    </div>
    </main>
  </body>
</html>
