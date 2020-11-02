package com.example.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// コントローラーを示すアノテーション
@Controller
public class HelloController {
	// ルーティングを示すアノテーション
	// URLへのGETリクエストとjavaメソッドを紐づける

	@GetMapping("/")
	// 複数のURLをハンドリングする場合
    public String index(Model model) {
		// 環境変数MESSAGEの値を取得してmessageに格納
		String version = System.getenv("APP_VERSION");
		if(version == null) version = "Default Version";
		// modelを利用してテンプレート用の変数を渡す
		// テンプレートに対してtargetという変数でversionの内容を渡す
		model.addAttribute("target", version);
		return "index";
    }

}
