<%@page import="java.util.List"%>
<%@page import="com.example.Employee_management2.employee.domain.model.Employee"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <head>
    <meta charset="UTF-8">
    <title>header</title>
    <link rel="stylesheet" href="header.css">
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
                <a href="#" class="header-menu-link font-color-white">従業員登録</a>
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

    <main class="employee-detail">
      <div class="employee-detail-box">
        <table class="employee-detail-table">
          <tr>
            <td class="employee-detail-title">氏名</td>
            <td class="employee-detail-info-td"><div class="employee-info"><%= username %></div></td>
            <td>
              <a href="edit.html">編集　</a>
              <a href="delete.html">削除</a>
            </td>
          </tr>
          <tr>
            <td class="employee-detail-title">生年月日</td>
            <td class="employee-detail-info-td"><div class="employee-info"><%= birthday %></div></td>
            <td class="employee-info"><%= age %></td>
          </tr>
          <tr>
            <td class="employee-detail-title">性別</td>
            <td class="employee-detail-info-td"><div class="employee-info"><%= sex %></div></td>
          </tr>
          <tr>
            <td class="employee-detail-title">稼働先</td>
            <td class="employee-detail-info-td"><div class="employee-info"><%= employee_type_code %></div></td>
            <td class="employee-info-detail"><a href="operation.html">詳細</a></td>
          </tr>
          <tr>
            <td class="employee-detail-title">郵便番号</td>
            <td class="employee-detail-info-td"><div class="employee-info"><%= zipcode %></div></td>
          </tr>
          <tr>
            <td class="employee-detail-title">都道府県</td>
            <td class="employee-detail-info-td"><div class="employee-info"><%= address1 %></div></td>
          </tr>
          <tr>
            <td class="employee-detail-title">市町村</td>
            <td class="employee-detail-info-td"><div class="employee-info"><%= address2 %></div></td>
          </tr>
          <tr>
            <td class="employee-detail-title">町域</td>
            <td class="employee-detail-info-td"><div class="employee-info"><%= address3 %></div></td>
          </tr>
          <tr>
            <td  class="employee-detail-title">丁目以降</td>
            <td class="employee-detail-info-td"><div class="employee-info"><%= block_name %></div></td>
          </tr>
          <tr>
            <td class="employee-detail-title">電話番号</td>
            <td class="employee-detail-info-td"><div class="employee-info"><%= phone_number %></div></td>
          </tr>
          <tr>
            <td class="employee-detail-title">email</td>
            <td class="employee-detail-info-td"><div class="employee-info"><%= email %></div></td>
          </tr>
        </table>
      </div>

    </main>
  </body>