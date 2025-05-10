package com.startjava.lesson_2_3.method;

public class BooleanMethods {

    public boolean isProgramContinuingOrEnding() {
        System.out.print(MethodNameHelper.getCurrentMethodName() + "() -> программа выполняется далее или завершается? ");
        return true;
    }

    public boolean hasUniqueDigitInSequence() {
        System.out.print(MethodNameHelper.getCurrentMethodName() + "() -> последовательность содержит уникальную цифру? ");
        return false;
    }

    public boolean isLetterEnteredByUser() {
        System.out.print(MethodNameHelper.getCurrentMethodName() + "() -> пользователь ввел букву или что-то другое? ");
        return true;
    }

    public boolean areEqualDigitsInCheckedNumbers() {
        System.out.print(MethodNameHelper.getCurrentMethodName() + "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }

    public boolean hasMarioGameAttemptsLeft() {
        System.out.print(MethodNameHelper.getCurrentMethodName() + "() -> в игре \"Марио\" остались попытки? ");
        return true;
    }

    public boolean isEmptyOrWhitespaceStringEntered() {
        System.out.print(MethodNameHelper.getCurrentMethodName() + "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return false;
    }

    public boolean isEvenNumberRolledOnDice() {
        System.out.print(MethodNameHelper.getCurrentMethodName() + "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return true;
    }

    public boolean isValidFilePathOnSSD() {
        System.out.print(MethodNameHelper.getCurrentMethodName() + "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean doesFileExistAtPath() {
        System.out.print(MethodNameHelper.getCurrentMethodName() + "() -> файл по указанному адресу существует? ");
        return true;
    }
}
