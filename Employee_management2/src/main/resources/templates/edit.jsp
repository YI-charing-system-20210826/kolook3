<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.example.Employee_management2.employee.domain.model.Employee"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>編集画面</title>
</head>
  <body>
    <!-- ヘッダー -->
    <header>
      <div class="header-large-box">

        <!-- ヘッダー上部 -->
        <div class="header-upper">

          <!-- ヘッダー左部 -->
          <div class="header-left">
            <!-- サービス名を記載 -->
            <div class="header-logo-box">
              <h1 class="header-logo"><a href="#" class="font-color-white">サービス名</a></h1>
            </div>
            <!-- //サービス名を記載 -->
          </div>
          <!-- //ヘッダー左部 -->

          <!-- ヘッダー右部 -->
          <div class="header-right">
            <!-- ログインしているユーザー名(管理者)を表示 -->
            <div class="header-user-box">
              <p class="header-user-name font-color-white">ユーザー名表示</p>
            </div>
            <!-- //ログインしているユーザー名(管理者)を表示 -->
          </div>
          <!-- //ヘッダー右部 -->
        </div>
        <!-- //ヘッダー上部 -->

        <!-- ヘッダー下部 -->
        <div class="lower">
          <div class="header-menu">
            <!-- 各ページのリンクをリスト化 -->
            <ul class="header-menu-ul">
              <!-- トップページリンク -->
              <li class="header-menu-list">
                <a href="top.html" class="header-menu-link font-color-white">トップページ</a>
              </li>
              <!-- 一覧ページリンク -->
              <li class="header-menu-list">
                <a href="detail.html" class="header-menu-link font-color-white">従業員一覧</a>
              </li>
              <!-- 従業員登録ページリンク -->
              <li class="header-menu-list">
                <a href="register.html" class="header-menu-link font-color-white">従業員登録</a>
              </li>
              <!-- 管理者登録ページリンク -->
              <li class="header-menu-list last-menu-list">
                <a href="#" class="header-menu-link font-color-white">管理者登録</a>
              </li>
            </ul>
            <!-- //各ページのリンクをリスト化 -->
          </div>
        </div>
        <!-- //ヘッダー下部 -->
      </div>
    </header>
    <!-- ヘッダー -->

    <!-- 詳細 -->
    <form action="/example/Employee_management2/employee/Controller/EmployeeEditController.java" method="post">
    <main class="employee-detail">
      <div class="employee-detail-box">
        <table class="employee-detail-table">
          <tr>
            <td class="employee-detail-title">氏名</td>
            <td class="employee-detail-info-td"><div class="employee-info">
              <input type="text" name="name">
            </div></td>
            <td>
            </td>
          </tr>
          <tr>
            <td class="employee-detail-title">生年月日</td>
            <td class="employee-detail-info-td"><div class="employee-info">
              <input type="date" name="birthday">
            </div></td>

            <td class="employee-info">年齢：</td>
            <!-- cssを変更していないので余白が無駄に出来てしまう-->
            <td class="employee-detail-info-td"><div class="employee-info"></div>
              <input type="number" name="age">
            </div></td>
          </tr>
          <tr>
            <td class="employee-detail-title">性別</td>
            <td class="employee-detail-info-td"><div class="employee-info">
              <input type="radio" name="sexes" value="male">男
              <input type="radio" name="sexes" value="female">女
            </div></td>
          </tr>
          <tr>
            <td class="employee-detail-title">稼働先</td>
            <td class="employee-detail-info-td"><div class="employee-info">
              <input type="text">
            </div></td>
            <td class="employee-language">

                <input type="checkbox" name="course" value="html">HTML

                <input type="checkbox" name="course" value="js">JS<br>

                <input type="checkbox" name="course" value="css">CSS

                <input type="checkbox" name="course" value="java">JAVA<br>

                <input type="checkbox" name="course" value="php">PHP

                <input type="checkbox" name="corse" value="python">python<br>

                <input type="checkbox" name="course" value="ruby">ruby
            </td>
          </tr>
          <tr>
            <td class="employee-detail-title">郵便番号</td>
            <td class="employee-detail-info-td"><div class="employee-info">
              <input type="text" name="zipcode">
            </div></td>
          </tr>
          <tr>
            <td class="employee-detail-title">都道府県</td>
            <td class="employee-detail-info-td"><div class="employee-info">
              <select name="address1">
                <option value="" selected>都道府県</option>
                <option value="1">北海道</option>
                <option value="2">青森県</option>
                <option value="3">岩手県</option>
                <option value="4">宮城県</option>
                <option value="5">秋田県</option>
                <option value="6">山形県</option>
                <option value="7">福島県</option>
                <option value="8">茨城県</option>
                <option value="9">栃木県</option>
                <option value="10">群馬県</option>
                <option value="11">埼玉県</option>
                <option value="12">千葉県</option>
                <option value="13">東京都</option>
                <option value="14">神奈川県</option>
                <option value="15">新潟県</option>
                <option value="16">富山県</option>
                <option value="17">石川県</option>
                <option value="18">福井県</option>
                <option value="19">山梨県</option>
                <option value="20">長野県</option>
                <option value="21">岐阜県</option>
                <option value="22">静岡県</option>
                <option value="23">愛知県</option>
                <option value="24">三重県</option>
                <option value="25">滋賀県</option>
                <option value="26">京都府</option>
                <option value="27">大阪府</option>
                <option value="28">兵庫県</option>
                <option value="29">奈良県</option>
                <option value="30">和歌山県</option>
                <option value="31">鳥取県</option>
                <option value="32">島根県</option>
                <option value="33">岡山県</option>
                <option value="34">広島県</option>
                <option value="35">山口県</option>
                <option value="36">徳島県</option>
                <option value="37">香川県</option>
                <option value="38">愛媛県</option>
                <option value="39">高知県</option>
                <option value="40">福岡県</option>
                <option value="41">佐賀県</option>
                <option value="42">長崎県</option>
                <option value="43">熊本県</option>
                <option value="44">大分県</option>
                <option value="45">宮崎県</option>
                <option value="46">鹿児島県</option>
                <option value="47">沖縄県</option>
                </select>
            </div></td>
          </tr>
          <tr>
            <td class="employee-detail-title">市町村</td>
            <td class="employee-detail-info-td"><div class="employee-info">
              <input type="text" name="address2">
            </div></td>
          </tr>
          <tr>
            <td class="employee-detail-title">町域</td>
            <td class="employee-detail-info-td"><div class="employee-info">
              <input type="text" name="address3">
            </div></td>
          </tr>
          <tr>
            <td  class="employee-detail-title">丁目以降</td>
            <td class="employee-detail-info-td"><div class="employee-info">
              <input type="text" name="block-name">
            </div></td>
          </tr>
          <tr>
            <td class="employee-detail-title">電話番号</td>
            <td class="employee-detail-info-td"><div class="employee-info">
              <input type="tel" name="phonenumber">
            </div></td>
          </tr>
          <tr>
            <td class="employee-detail-title">email</td>
            <td class="employee-detail-info-td"><div class="employee-info">
              <input type="email" name="email">
            </div></td>
          </tr>
          <tr>
            <td class="employee-detail-title">Line名</td>
            <td class="employee-detail-info-td"><div class="employee-info">
              <input type="text" name="line-name"><br><br><br>
              <!-- cssを調整していないので表示が変-->

              <button type="submit" class="btn">更新</button>
            </div></td>
          </tr>
        </table>
      </div>
    </main>
    </form>
  </body>