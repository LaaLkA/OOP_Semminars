##Шаги реализации

- #####Определите, можно ли создать более простой интерфейс, чем тот, который предоставляет сложная подсистема. Вы на правильном пути, если этот интерфейс избавит клиента от необходимости знать о подробностях подсистемы.

- #####Создайте класс фасада, реализующий этот интерфейс. Он должен переадресовывать вызовы клиента нужным объектам подсистемы. Фасад должен будет позаботиться о том, чтобы правильно инициализировать объекты подсистемы.

- #####Вы получите максимум пользы, если клиент будет работать только с фасадом. В этом случае изменения в подсистеме будут затрагивать только код фасада, а клиентский код останется рабочим.

- #####Если ответственность фасада начинает размываться, подумайте о введении дополнительных фасадов.

##Преимущества

- #####Изолирует клиентов от компонентов сложной подсистемы.

##Недостатки

- #####Фасад рискует стать божественным объектом, привязанным ко всем классам программы.