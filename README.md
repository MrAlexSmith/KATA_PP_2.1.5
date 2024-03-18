# KATA Academy. PRE-PROJECT

## Поток: java_dec26_2023_3
### Группа: j_12_23_3_sf_2
### Студент: Ковалёв А.Н.
___

# Практическая задача 2.1.5 Java pre-project. Практическая задача 2.1.4. Виды связывания бинов.

---
## Практическая задача

### Условие:
Склонируйте заготовку проекта по [ссылке](https://github.com/KataAcademy/PP_2_1_4_spring-types-of-wiring).

_«На море на океане есть остров, на том острове дуб стоит,
под дубом сундук зарыт, в сундуке — заяц, в зайце — утка,
в утке — яйцо, в яйце — игла, — смерть Кощея»_  
Зависимости остались прежние. В упражнении появился компонент
Кощей Бессмертный (**KoscheiTheDeathless**), который расскажет,
где находится его смерть, если вызвать метод **getRulesByDeth()**.  
Для описания поиска смерти использованы классы в пакете **models**.
Для вашего удобства они были пронумерованы: **Ocean1, Island2, Wood3** и так далее.  
Чтобы Спринг видел все бины, в классе **AppConfig** была добавлена аннотация **@ComponentScan**.

<u>В Спринге связать бины можно различными способами, рассмотрим их на примере:</u>
1) **KoscheiTheDeathless** связывается с **Ocean1** через сеттер **setOcean**
и аннотации **@Autowired** над ней.
2) **Ocean1** связан с **Island2** через поле и аннотацию,
которая подтянет бин **Island2** через метод **getIsland()** в классе **AppConfig**.
Обратите внимание, что данный метод обозначен аннотацией **@Bean**,
что автоматически подтягивает аргументы в метод. В качестве аргумента выступает бин **Wood3**.
3) Бин **Wood3** помечен как компонент, который конструируется через связывание
по **@Autowired** с помощью конструктора.

### Задание:

Собрать цепочку до 8го элемента, использовав все вышеперечисленные методы связывания.
После выполнения вы должны получить полную фразу. Проверьте своё решение тестом из заготовки.