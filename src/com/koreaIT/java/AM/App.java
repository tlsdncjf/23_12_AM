package com.koreaIT.java.AM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.koreaIT.java.AM.controller.ArticleController;
import com.koreaIT.java.AM.controller.Controller;
import com.koreaIT.java.AM.controller.MemberController;
import com.koreaIT.java.AM.dto.Article;
import com.koreaIT.java.AM.dto.Member;

public class App {

	List<Article> articles;
	List<Member> members;

	public App() {
		articles = new ArrayList<>();
		members = new ArrayList<>();
	}

	public void run() {
		System.out.println("== 프로그램 시작 == ");

		Scanner sc = new Scanner(System.in);

		MemberController memberController = new MemberController(sc);
		ArticleController articleController = new ArticleController(sc);

		Controller controller = null;

		articleController.makeTestData();
		memberController.makeTestData();

		while (true) {
			System.out.print("명령어 > ");
			String cmd = sc.nextLine().trim();

			if (cmd.length() == 0) {
				System.out.println("명령어를 입력하세요1");
				continue;
			}

			if (cmd.equals("exit")) {
				break;
			}
			String[] cmdBits = cmd.split(" ");

			String controllerName = cmdBits[0];

			if (cmdBits.length == 1) {
				System.out.println("명령어를 확인해줘2");
				continue;
			}

			String actionMethodName = cmdBits[1];

			if (controllerName.equals("article")) {
				controller = articleController;
			} else if (controllerName.equals("member")) {
				controller = memberController;
			} else {
				System.out.println("사용할 수 없는 명령어입니다3");
				continue;
			}
			controller.doAction(actionMethodName, cmd);
		}

		System.out.println("== 프로그램 끝 == ");

		sc.close();

	}

}