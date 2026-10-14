# Практическая работа №3

Проект содержит обе части практической работы:

- `vehicles` и `app` — абстрактный класс `Vehicle`, интерфейс
  `ElectricVehicle` и тестирование автомобилей;
- `bikeproject` — велосипедный проект, дополненный интерфейсами
  `BikeParts`, `MountainParts` и `RoadParts`.

## Ответы на вопросы

1. Пример примитивного типа данных: `int`. Он используется для полей
   `numGears`, `frameSize`, `tyreWidth` и `postHeight`.
2. Конкатенация строк выполняется в методах `printDescription()`, например:
   `"This bike has " + handleBars + " handlebars"`.
3. В `BikeDriver` созданы объекты `bike1`, `bike2`, `bike3`, `bike4`.
4. В классе `Bike` два конструктора, в `MountainBike` два конструктора,
   в `RoadBike` три конструктора. У интерфейсов конструкторов нет.
5. `Bike` — суперкласс для `MountainBike` и `RoadBike`.
   `MountainBike` и `RoadBike` — его подклассы.
6. Стандартный горный велосипед: руль `Bull Horn`, рама `Hardtail`,
   шины `Maxxis`, седло `dropper`, 27 передач, подвеска `RockShox XC32`,
   тип `Pro`, размер рамы 19 дюймов. Стандартный шоссейный велосипед:
   руль `drop`, рама `racing`, шины `tread less`, седло `razor`,
   19 передач, ширина шин 20 мм, высота подседельного штыря 22.

## Запуск

Из корня `Practice3`:

```bash
javac -d out vehicles/*.java app/*.java bikeproject/*.java
java -cp out app.TestCar
java -cp out bikeproject.BikeDriver
```
