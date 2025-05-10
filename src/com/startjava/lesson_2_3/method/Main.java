package com.startjava.lesson_2_3.method;

public class Main {

    public static void main(String[] args) {
        callNonBooleanMethods();
        callBooleanMethods();
    }

    private static void callNonBooleanMethods() {
        System.out.println("НЕ BOOLEAN-МЕТОДЫ:");
        NonBooleanMethods nonBooleanMethods = new NonBooleanMethods();
        nonBooleanMethods.findLongestWordInJavaBook();
        nonBooleanMethods.selectMenuItemInMacOSEditor();
        nonBooleanMethods.calculateAverageGradeSchool1234();
        nonBooleanMethods.countUniqueWordsInWarAndPeace();
        nonBooleanMethods.displayErrorMessage();
        nonBooleanMethods.syncDataWithCloudStorage();
        nonBooleanMethods.restoreDataFromBackup11032024();
        nonBooleanMethods.pauseMp3FileDownloadAria();
        nonBooleanMethods.resetVacuumCleanerMiToFactorySettings();
        nonBooleanMethods.writeContentToFileOnFlashDrive();
        nonBooleanMethods.convertCelsiusToFahrenheit();
        nonBooleanMethods.inputMathExpressionWithThreeArguments();
        nonBooleanMethods.identifyWinnerAmongNeedForSpeedRacers();
        nonBooleanMethods.findBookByAuthorName();
        System.out.println();
    }

    private static void callBooleanMethods() {
        System.out.println("BOOLEAN-МЕТОДЫ:");
        BooleanMethods booleanMethods = new BooleanMethods();
        System.out.println(booleanMethods.isProgramContinuingOrEnding());
        System.out.println(booleanMethods.hasUniqueDigitInSequence());
        System.out.println(booleanMethods.isLetterEnteredByUser());
        System.out.println(booleanMethods.areEqualDigitsInCheckedNumbers());
        System.out.println(booleanMethods.hasMarioGameAttemptsLeft());
        System.out.println(booleanMethods.isEmptyOrWhitespaceStringEntered());
        System.out.println(booleanMethods.isEvenNumberRolledOnDice());
        System.out.println(booleanMethods.isValidFilePathOnSSD());
        System.out.println(booleanMethods.doesFileExistAtPath());
        System.out.println();
    }
}
