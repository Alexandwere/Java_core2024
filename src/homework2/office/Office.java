package homework2.office;

public class Office {
    //Создать пакет office.
    //Создать класс офис, в котором есть босс, менеджер, секретарь, охранник.
    //Босс обладает именем. Умеет подгонять менеджера - "{Имя менеджера}" быстрее!
    //Менеджер обладает именем. Умеет кричать - "я ничего не успеваю, помогите!".
    //Секретарь умеет просить менеджера и босса успокоится, а охранника подождать:
    //"{Имя босса} не волнуйтесь, {имя менеджера} все успеет. {имя охранника} - подождите!"
    //Охранник обладает именем. Просит выдать ему аванс.
    //В офисе есть метод рабочий день:
    //--Босс начинает подгонять менеджера
    //--Менеджер кричит
    //--Охранник просит аванс
    //--Секретарша всех успокаивает, и просит подождать
    //Создать класс Runner, в котором:
    //Создать босса (Петр Николаевич), Менеджера (Володя), охранника (Петрович)
    //Секретаря.
    //Создать офис
    //Запустить рабочий день в офисе

    Boss boss;
    Manager manager;
    Secretary secretary;
    Guardian guardian;

    public Office(Boss boss, Manager manager, Secretary secretary, Guardian guardian) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.guardian = guardian;
    }
     public void workDay(){
        boss.speak(manager.getName());
        manager.speak();
        guardian.speak();
        secretary.speak(boss.getName(), manager.getName(), guardian.getName());
     }
}
