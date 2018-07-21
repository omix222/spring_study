package com.example.springstudy;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TimeController {
	@RequestMapping("/time")
	//引数にModelのクラスを持つことで、SpringによりModelのインスタンスを動的に渡してもらえる
	public String whattime(Model model) {
		Date date = new Date();
		// Modelに対し、addAttributeメソッドで値を渡せる
		//ここでは画面表示に渡す値をdate というキー名で渡している
		model.addAttribute("date", date.toString());
		// templateのHTMLファイル名を指定。time.htmlを指定している
		return "time";
	}
}
