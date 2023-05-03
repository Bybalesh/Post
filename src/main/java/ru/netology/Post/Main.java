package ru.netology.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.passport = 521769954; //post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phoneNumber = 986632765; //post.phoneNumber = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}
