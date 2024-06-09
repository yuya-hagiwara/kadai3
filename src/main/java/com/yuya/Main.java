package com.yuya;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか、
// ガターで <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("高橋", "18歳。生まれて一度も彼女ができた事がありません。");
        userMap.put("萩原", "27歳。５年間彼女がいなく、結婚願望あり。");
        userMap.put("岡田", "33歳。既婚者の子供が２人。だけど離婚寸前");
        userMap.put("佐伯", "45歳。バツイチ子持ちのシングルファザー。だけど再婚の意欲があり。");
        userMap.put("高山", "60歳。奥様と30年経ってもラブラブ。だけど刺激を求めている");

        for (String key : userMap.keySet()) {
            System.out.println(key + "さんは" + userMap.get(key));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("ユーザー名を入力して下さい:");
        String name = scanner.nextLine();

        try {
            if (userMap.containsKey(name)) {
                System.out.println(name + "さんは" + userMap.get(name));
            } else {
                throw new UserNotFoundException("ユーザーが見つかりません");
            }
        } catch (UserNotFoundException e) {
            System.out.println("このユーザーは見つかりません。もう一度名前を入力してください。");
        }
    }
}

