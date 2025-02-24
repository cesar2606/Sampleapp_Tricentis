package intern;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.SessionId;
import support.android.ScrollAndroid;
import support.android.adriver.SetCapabilities;
import support.android.find.ActionsAndroid;
import support.android.find.GetterActionsAndroid;
import support.android.find.SendsAndroid;
import support.android.find.exceptionals.AlertsAndroid;
import support.android.find.exceptionals.ExceptionalsAndroid;
import support.android.sleep.SleepAndroid;
import support.convert.Converter;
import support.convert.dates.Adder;
import support.convert.dates.Datter;
import support.convert.dates.Remover;
import support.db.Db;
import support.db.SetDb;
import support.db.TypeDB;
import support.error.Error;
import support.log.Log;
import support.rest.*;
import support.screen.driver.Screen;
import support.screen.find.ActionsScreen;
import support.screen.find.ClicksScreen;
import support.screen.find.MoveScreen;
import support.screen.find.SendsScreen;
import support.screen.sleep.SleepScreen;
import support.tbi.JRobot;
import support.web.ScrollWeb;
import support.web.driver.WebDriver;
import support.web.driver.*;
import support.web.find.*;
import support.web.find.combobox.ComboBox;
import support.web.find.combobox.GetterComboBox;
import support.web.find.combobox.SetterComboBox;
import support.web.find.exceptionals.ExceptionalsWeb;
import support.web.find.exceptionals.FramesWeb;
import support.web.find.exceptionals.GetterPopUps;
import support.web.find.exceptionals.PopUps;
import support.web.sleep.SleepWeb;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import java.io.*;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Instances {

    public static String chrome = "chrome";
    public static String firefox = "firefox";
    public static String internetExplorer = "internetExplorer";
    public static String phantomjs = "phantomjs";
    public static String androidLastDeviceName = "";
    public static String androidLastUdid = "";
    public static String scenario = "";
    protected static String feature = "";
    public static String step = "";
    static boolean tevePasso = false;
    private static Throwable lastException = null;
    private static float screenDefaultPrecision = 0.8f;
    private static Set<String> lastWindows = null;
    private static Iterator<String> lastIeratos = null;
    private static boolean isAvailable = false;
    private static String webLastLog = null;
    private static String screenLastLog = null;
    private static String androidLastLog = null;
    private static ActionsWeb actionsWebClassInstance = null;
    private static Log logClassInstance = null;
    private static PopUps popUpsClassInstance = null;
    private static Converter converterClassInstance = null;
    private static ScrollWeb scrollWebClassInstance = null;
    private static SleepWeb sleepWebClassInstance = null;
    private static SleepAndroid sleepAndroidClassInstance = null;
    private static support.android.adriver.AndroidDriver androidDriverClassInstance = null;
    private static WebDriver webDriverClassInstance = null;
    private static Error errorClassInstance = null;
    private static FramesWeb framesWebClassInstance = null;
    private static ExceptionalsWeb exceptionalsWebClassInstance = null;
    private static Datter datterClassInstance = null;
    private static SetDb setDbClassInstance = null;
    private static TypeDB typeDBClassInstance = null;
    private static Db dbClassInstance = null;
    private static SendsWeb sendsWebClassInstance = null;
    private static ClicksWeb clicksWebClassInstance = null;
    private static ComboBox comboBoxClassInstance = null;
    private static GetterActionsWeb findGetterActionsWebClassInstance = null;
    private static LocatorWeb locatorWebClassInstance = null;
    private static LocatorAndroid locatorAndroidClassInstance = null;
    private static GetterPopUps getterPopUpsClassInstance = null;
    private static SetterComboBox setterComboBoxClassInstance = null;
    private static GetterComboBox getterComboBoxClassInstance = null;
    private static GetterConfig getterConfigClassInstance = null;
    private static SetterConfig setterConfigClassInstance = null;
    private static ChromeCapabilities chromeCapabilitiesClassInstance = null;
    private static IEOptions iEOptionsClassInstance = null;
    private static BrowserTypes browserTypesClassInstance = null;
    private static DriverOptions driverOptionsClassInstance = null;
    private static Adder adderClassInstance = null;
    private static Remover removerClassInstance = null;
    private static Screenshot screenshotClassInstance = null;
    private static Report reportClassInstance = null;
    private static AssertThat assertThatClassInstance = null;
    private static Screen screenClassInstance = null;
    private static DesiredCapabilities androidDesiredCapabilities = null;
    private static support.android.adriver.Capabilities capabilitiesClassInstance = null;
    private static Date dateClassInstance = null;
    private static SetCapabilities setCapabilitiesClassInstance = null;
    private static ActionsAndroid actionsAndroidClassInstance = null;
    private static Execute executeClassInstance = null;
    private static SendsAndroid sendsAndroidClassInstance = null;
    private static ExceptionalsAndroid exceptionalsAndroidClassInstance = null;
    private static AlertsAndroid alertsAndroidClassInstance = null;
    private static ScrollAndroid scrollAndroidClassInstance = null;
    private static ActionsScreen actionsScreenClassInstance = null;
    private static SendsScreen sendsScreenClassInstance = null;
    private static MoveScreen moveScreenClassInstance = null;
    private static ClicksScreen clicksScreenClassInstance = null;
    private static GetterActionsAndroid getterActionsAndroidClassInstance = null;
    private static JRobot jRobotClassInstance = null;
    private static SleepScreen sleepScreenClassInstance = null;
    private static BodyREST bodyRESTClassInstance = null;
    private static HeadersREST headersRESTClassInstance = null;
    private static ParametersREST parametersRESTClassInstance = null;
    private static ResponseBodyREST responseBodyRESTClassInstance = null;
    private static ResponseResponseTimeREST responseResponseTimeRESTClassInstance = null;
    private static ResponseREST responseRESTClassInstance = null;
    private static ResponseStatusREST responseStatusRESTClassInstance = null;
    private static SendREST sendRESTClassInstance = null;
    private static TypeOfREST typeOfRESTClassInstance = null;
    private static String dbuser = "";
    private static String dbpassword = "";
    private static String dbtnsnames = "";
    private static String dbtype = "oracle";
    private static String dbname = "";
    private static String dbadress = "";
    private static String dbport = "";
    private static LinkedHashMap<String, String> locator;
    private static String screenShotLocation = "";
    private static Boolean softAssert = false;
    private static String resourcesPath = System.getProperty("user.dir") + "/src/test/resources/";
    private static String jenkinsPath = resourcesPath + "Relatorio/";
    private static String jenkinsAnexosPath = jenkinsPath + "anexos/";
    private static String detailedHtmlReportFileName = "Relatorio_detalhado_testes.html";
    private static String detailedHtmlReportFileLoc = jenkinsAnexosPath + detailedHtmlReportFileName;
    private static String jenkinsEvidencesPath = jenkinsPath + "evidencias/";
    private static List<List<Object>> tabName = new ArrayList<>();
    private static List<List<Object>> tabNameClosed = new ArrayList<>();
    private static boolean testsKilled = false;
    private static boolean each = false;
    private static boolean slow = false;
    private static long executionActionTimer = 0;
    private static long executionStartTimer = 0;
    private static boolean resetPageLoad = false;
    private static int defaultWaitMilisBackUp = 10000;
    private static int defaultWaitMilis = 10000;
    private static org.sikuli.script.Screen screenSikuli = null;
    private static boolean headless = false;
    private static boolean compability = false;
    private static boolean cleanSection = false;
    private static boolean maximized = false;
    private static int[] resolution = {1440, 900};
    private static String webdriverType = "chrome";
    private static int webdriverPageNumber = 0;
    private static org.openqa.selenium.WebDriver webDriver = null;
    private static AppiumDriver<MobileElement> androidDriver = null;
    private static String webLastXpath = "";
    private static String androidLastXpath = "";
    private static String screenLastXpath = "";
    private static float screenLastPrecision = 0;
    private static String assertionText = "";
    private static List<WebElement> webLastElements = null;
    private static List<MobileElement> androidLastElements = null;
    private static ExtentReports extent = null;
    private static String author = "";
    private static String environment = "";
    private static String category = "";
    private static String product = "";
    private static String lastTag = "";
    private static ExtentTest featureSection;
    private static ExtentTest scenarioSection;
    private static ExtentTest bddSection;
    private static JSONObject bsonInputInfoTest = null;
    private static String reset = "\u001B[0m";
    private static String yellow = "\u001B[33m";
    private static String cyan = "\u001B[36m";
    private static String purple = "\u001B[35m";
    private static String white = "\u001B[37m";
    private static String messageStepSkipped = yellow + "PASSO NÃO EXECUTADO!" + reset;
    private static String messageWaitDisapearStillHasElement = yellow + "O ELEMENTO ALMEJADO PARA DESAPARECER AINDA ESTAVA DISPONÍVEL APÓS O TEMPO MÁXIMO DE ESPERA!" + reset;
    private static String messageWaitAppearStillHasElement = yellow + "O ELEMENTO ALMEJADO PARA APARECER NÃO ESTAVA DISPONÍVEL APÓS O TEMPO MÁXIMO DE ESPERA!" + reset;
    private static String messageExecutionInterrupted = yellow + "EXECUÇÃO INTERROMPIDA!" + reset;
    private static String messageFailTests = yellow + "FALHA NOS TESTES!" + reset;
    private static String messageWarning = yellow + "[ALERTA]" + reset;
    private static String messageEnvironmentError = yellow + "FALHA NO AMBIENTE!" + reset;
    private static String messageNumberTooLong = yellow + "\n\nO NÚMERO EXTRAÍDO ERA MUITO LONGO, PERTENCE AO TIPO DE VARIÁVEL " + cyan + "LONG" + yellow + "!\n\n" +
            "UTILIZE A FUNÇÃO " + cyan + " convert().toLong(" + purple + "SEUVALOR" + cyan + ");" + yellow + " PARA RESOLVER O PROBLEMA!" + reset;
    private static String messageMapNotDefined =
            "\n" + yellow +
                    "VOCÊ NÃO DEFINIU O MAPA DE LOGS (LEIA TODOS OS PASSOS ABAIXO PARA A SOLUÇÃO)" +
                    "\n" +
                    "\n" +
                    "A função " + cyan + "log().setLocator(" + purple + "NOMEMAPA" + cyan + ");" + yellow + " DEVE ser chamada antes das funções de ação (" + cyan + "find" + yellow + ")." +
                    "" +
                    "" +
                    "\n" +
                    "\n" +
                    "Para descobrir o nome do mapa, utilize o atalho " + cyan + "F4" + yellow + " no localizador para navegar até a classe de objects." +
                    "\n" +
                    "\n" +
                    "O mapa provavelmente estará assim: " + white + "public static" + cyan + " LinkedHashMap<" + white + "String" + cyan + ", " + white + "String" + cyan + "> " + purple + "NOMEMAPA" + white + " = createData();" + yellow +
                    "\n" +
                    "\n" +
                    "Exemplo incorreto:\n" +
                    "...\n" +
                    cyan + "find(" + purple + "LOCALIZADOR" + cyan + ");\n" + yellow +
                    "...\n\n" +
                    "Exemplo correto:\n" +
                    "...\n" +
                    cyan + "log().setLocator(" + purple + "NOMEMAPA" + cyan + ");\n" +
                    "find(" + purple + "LOCALIZADOR" + cyan + ");\n" + yellow +
                    "..." + reset;
    private static String messageScreenshotForced = "Tirando uma evidência - ";
    private static String messageWaitAppear = "Aguardando a exibição do elemento ";
    private static String messageWaitAppearEach = "Aguardando a exibição de todos os elementos que remetem ao localizador do ";
    private static String messageWaitDisapear = "Aguardando a não exibição do elemento ";
    private static String messageWaitDisapearEach = "Aguardando a não exibição de todos os elementos que remetem ao localizador do ";
    private static String messageClick = "Clicando no elemento ";
    private static String messageClickTwice = "Clicando duas vezes no elemento ";
    private static String messageClickThrice = "Clicando três vezes no elemento ";
    private static String messageClickEach = "Clicando em todos os elementos que remetem ao localizador do ";
    private static String messageClear = "Limpando o campo ";
    private static String messageClearEach = "Limpando todos os campos que remetem ao localizador do ";
    private static String messageDoubleClick = "Clicando duas vezes no elemento ";
    private static String messageDoubleClickEach = "Clicando duas vezes em todos os elementos que remetem ao localizador do ";
    private static String messageSend = "Enviando o texto 'arg0' para o campo ";
    private static String messageUntilDisapear = "Aguardando a imagem 'arg0' desaparecer";
    private static String messageUntilDisapearFail = "A imagem 'arg0' não desapareceu";
    private static String messageSendEach = "Enviando o texto 'arg0' para todos os campos que remetem ao localizador do ";
    private static String messageSendSlow = "Enviando o texto 'arg0' devagar para o campo ";
    private static String messageSendSlowEach = "Enviando o texto 'arg0' devagar para todos os campos que remetem ao localizador do";
    private static String messageMove = "Simulando o mouse sobre o elemento ";
    private static String messageMoveScreen = "Movendo o mouse para a imagem ";
    private static String messageMoveScreenCoord = "Movendo o mouse para as coordenadas 'arg0' e 'arg1'";
    private static String messageMoveScreenRelative = "Movendo o mouse para as coordenadas 'arg0' e 'arg1' relativas a imagem ";
    private static String messageMoveEach = "Simulando o mouse sobre o todos os elementos que remetem ao localizador do ";
    private static String messageExists = "Validando a existência do elemento ";
    private static String messageExistsEach = "Validando a existência de todos os elementos que remetem ao localizador do ";
    private static String messageComboBoxText = "Selecionando o texto 'arg0' no ComboBox ";
    private static String messageComboBoxTextEach = "Selecionando o texto 'arg0' em todos os ComboBox que remetem ao localizador do ";
    private static String messageComboBoxValue = "Selecionando o valor 'arg0' no ComboBox ";
    private static String messageComboBoxValueEach = "Selecionando o valor 'arg0' em todos os ComboBox que remetem ao localizador do ";
    private static String messageComboBoxIndex = "Selecionando o index 'arg0' no ComboBox ";
    private static String messageComboBoxIndexEach = "Selecionando o index 'arg0' em todos os ComboBox que remetem ao localizador do ";
    private static String messageComboBoxGetSize = "Retornando a quantidade de itens do ComboBox ";
    private static String messageNavigate = "Navegando para a URI ";
    private static String messageInterrupt = "O teste foi programado para interromper neste passo";
    private static String messageAssertFailEquals = "O texto 'arg0' não era igual ao texto 'arg1'";
    private static String messageAssertFailContains = "O texto 'arg0' não continha o texto 'arg1'";
    private static String messageAssertFailStartsWith = "O texto 'arg0' não começava com o texto 'arg1'";
    private static String messageAssertFailEndsWith = "O texto 'arg0' não começava com o texto 'arg1'";
    private static String messageAssertEquals = "Validando que o texto 'arg0' era igual ao texto 'arg1'";
    private static String messageAssertContains = "Validando que o texto 'arg0' continha o texto 'arg1'";
    private static String messageAssertStartsWith = "Validando que o texto 'arg0' começava com o texto 'arg1'";
    private static String messageAssertEndsWith = "Validando que o texto 'arg0' começava com o texto 'arg1'";
    private static String messageRESTStatusError = "O status de resposta esperado era: 'arg0' e o recebido foi: 'arg1'";
    private static String messageRESTStatusSuccess = "Validando o status de resposta como: 'arg0'";
    private static String messageRESTResponseNull = "O corpo de resposta estava vazio";
    private static String messageRESTResponseNotContains = "O corpo de resposta não continha a chave: 'arg0'";
    private static String messageRESTResponseNotContainsString = "O corpo de resposta não possuía o conteudo: 'arg0'";
    private static String messageRESTResponseNotContainsKeyAndValue = "O corpo de resposta não continha a chave: 'arg0' com o valor: 'arg1'";
    private static String messageRESTResponseContains = "Validando que o corpo de resposta contém a chave: 'arg0'";
    private static String messageRESTResponseNotContainsResp = "Validando que o corpo de resposta não contém a chave: 'arg0'";
    private static String messageRESTResponseContainsString = "Validando que o corpo de resposta possui o conteúdo: 'arg0'";
    private static String messageRESTResponseNotContainsStringResp = "Validando que o corpo de resposta não possui o conteúdo: 'arg0'";
    private static String messageRESTResponseContainsKeyAndValue = "Validando que o corpo de resposta contém a chave: 'arg0' e o valor: 'arg1'";
    private static String messageRESTResponseNotContainsKeyAndValueResp = "Validando que o corpo de resposta não contém a chave: 'arg0' e o valor: 'arg1'";
    private static String messageRESTResponseEquals = "Validando que o corpo de resposta é igual a:";
    private static String messageRESTResponseNotEqualsMessage = "O corpo de resposta estava incorreto";
    private static String messageRESTResponseNotEquals = "O corpo de resposta esperado era:";
    private static String messageRESTResponseNotEquals2 = "O corpo de resposta recebido foi:";
    private static String messageRESTResponseTimeLessThan = "O tempo minimo esperado para a requisição era: 'arg0' e o tempo consumido foi: 'arg1'";
    private static String messageRESTResponseTimeOK = "Validando que o tempo de resposta foi menor ou igual a: 'arg0'";
    private static String messageRESTSendRequest = "Enviando request para o URI: 'arg0', com o endpoint: 'arg1'";
    private static String messageRESTSendParameter = "Adicionando o parametro key: 'arg0' e chave: 'arg1'";
    private static String messageRESTSendHeader = "Adicionando o header key: 'arg0' e chave: 'arg1'";
    private static String messageRESTSendToken = "Adicionando o token: 'arg1'";
    private static String androidDeviceName = "";
    private static String androidUdid = "";
    private static String androidPlatformName = "";
    private static String androidPlatformVersion = "";
    private static String androidLastPlatformName = "";
    private static String androidLastPlatformVersion = "";
    private static String androidSkipUnlock = "";
    private static String androidAppPackage = "";
    private static String androidAppActivity = "";
    private static String androidUrl = "http://localhost:4723/wd/hub";
    private static String restLastURI = "";
    private static String restLastEndPoint = "";
    private static List<JSONObject> restLastResponse = new ArrayList<>();
    private static int restLastStatus = 0;
    private static int restLastResponseTime = 0;
    private static HashMap<String, String> restLastParameters = new HashMap<>();
    private static HashMap<String, String> restLastHeaders = new HashMap<>();
    private static String restLastToken = "";
    private static String restLastTypeOfRequest = "";
    private static JSONObject restLastBody = new JSONObject();

    public static Throwable getLastException() {
        return lastException;
    }

    public static void setLastException(Throwable lastException) {
        Instances.lastException = lastException;
    }

    public static float getScreenDefaultPrecision() {
        return screenDefaultPrecision;
    }

    public static String getAndroidLastLog() {
        return androidLastLog;
    }

    public static void setAndroidLastLog(String androidLastLog) {
        Instances.androidLastLog = androidLastLog;
    }

    public static String getScreenLastLog() {
        return screenLastLog;
    }

    public static void setScreenLastLog(String screenLastLog) {
        Instances.screenLastLog = screenLastLog;
    }

    public static String getWebLastLog() {
        return webLastLog;
    }

    public static int getWebdriverPageNumber() {
        return webdriverPageNumber;
    }

    public static void setWebdriverPageNumber(int webdriverPageNumber) {
        Instances.webdriverPageNumber = webdriverPageNumber;
    }

    public static void setWebLastLog(String webLastLog) {
        Instances.webLastLog = webLastLog;
    }

    public static void setScreenSikuli() {
        if (screenSikuli == null) {
            screenSikuli = new org.sikuli.script.Screen();
        }
    }

    public static String getMessageUntilDisapearFail() {
        return messageUntilDisapearFail;
    }

    public static String getMessageUntilDisapear() {
        return messageUntilDisapear;
    }

    public static org.sikuli.script.Screen getScreenSikuli() {
        return screenSikuli;
    }

    public static String getAssertionText() {
        return assertionText;
    }

    public static void setAssertionText(String assertionText) {
        Instances.assertionText = assertionText;
    }

    public static boolean getIsAvailable() {
        return isAvailable;
    }

    static void setIsAvailable(boolean isAvailable) {
        Instances.isAvailable = isAvailable;
    }

    public static Set<String> getLastWindows() {
        return lastWindows;
    }

    public static void setLastWindows(Set<String> lastWindows) {
        Instances.lastWindows = lastWindows;
    }

    public static boolean getPageLoad() {
        return resetPageLoad;
    }

    public static void setPageLoad(boolean resetPageLoad) {
        Instances.resetPageLoad = resetPageLoad;
    }

    public static Iterator<String> getLastIeratos() {
        return lastIeratos;
    }

    public static void setLastIeratos(Iterator<String> lastIeratos) {
        Instances.lastIeratos = lastIeratos;
    }

    private static DesiredCapabilities getAndroidDesiredCapabilities() {
        if (androidDesiredCapabilities == null) {
            androidDesiredCapabilities = new DesiredCapabilities();
        }
        if (androidDeviceName.length() > 0) {
            androidDesiredCapabilities.setCapability("deviceName", androidDeviceName);
        }
        if (androidUdid.length() > 0) {
            androidDesiredCapabilities.setCapability("udid", androidUdid);
        }
        if (androidPlatformName.length() > 0) {
            androidDesiredCapabilities.setCapability("platformName", androidPlatformName);
        }
        if (androidPlatformVersion.length() > 0) {
            androidDesiredCapabilities.setCapability("platformVersion", androidPlatformVersion);
        }
        if (androidSkipUnlock.length() > 0) {
            androidDesiredCapabilities.setCapability("skipUnlock", androidSkipUnlock);
        }
        if (androidAppPackage.length() > 0) {
            androidDesiredCapabilities.setCapability("appPackage", androidAppPackage);
        }
        if (androidAppActivity.length() > 0) {
            androidDesiredCapabilities.setCapability("appActivity", androidAppActivity);
        }
        return androidDesiredCapabilities;
    }

    public static AppiumDriver<MobileElement> getAndroidDriver() {
        return androidDriver;
    }

    public static boolean checkLastDevice() {
        boolean eraIgual = true;
        if (!androidLastDeviceName.equals(androidDeviceName)
                || !androidLastUdid.equals(androidUdid)
                || !androidLastPlatformName.equals(androidPlatformName)
                || !androidLastPlatformVersion.equals(androidPlatformVersion)) {
            eraIgual = false;
        }
        return eraIgual;
    }

    public static void setAndroidDriver() {
        boolean sessionIDnull = false;
        try {
            SessionId session = (androidDriver).getSessionId();
            if (session.toString().equals("null")) {
                sessionIDnull = true;
            }
        } catch (NullPointerException e) {
            sessionIDnull = true;
        }

        if (androidDriver == null || sessionIDnull) {
            try {
                List<String> cmd = new ArrayList<>();

                cmd = Instances.commandEx("tasklist");
                boolean appiumAberto = false;
                for (String linha : cmd
                ) {
                    if (linha.contains("Appium")) {
                        appiumAberto = true;
                    }
                }
                String ports = androidUrl.split(":")[2];
                int porti = getConverterClassInstance().toInt(ports);

                cmd = Instances.commandEx("netstat -n");
                for (String linha : cmd) {
                    if (linha.contains(":" + porti)) {
                        commandEx("taskkill /F /IM \"node.exe\" /T");
                        break;
                    }
                }

                if (!appiumAberto) {
                    getReportClassInstance().stepWarning("O appium não estava aberto, iniciando o server..");
                    AppiumDriverLocalService server;
                    AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();

                    serviceBuilder.usingPort(porti);
                    String nodepath = System.getenv("NODE_PATH");
                    serviceBuilder.usingDriverExecutable(new File(nodepath));
                    String appiumpath = System.getenv("APPIUM_PATH");
                    serviceBuilder.withAppiumJS(new File(appiumpath));
                    server = AppiumDriverLocalService.buildService(serviceBuilder);
                    server.start();
                }

                String SERVER_URL = String.format(androidUrl, porti);

                URL status;
                try {
                    status = new URL(SERVER_URL + "/sessions");
                    new UrlChecker().waitUntilAvailable(defaultWaitMilis, TimeUnit.MILLISECONDS, status);
                    System.out.println("Appium conectado");
                } catch (UrlChecker.TimeoutException | MalformedURLException e) {
                    System.out.println("Nenhuma conexão pode ser estabelecida com o appium durante '" + defaultWaitMilis + "', abortando testes..");
                    getReportClassInstance().stepFatal(new Throwable("Nenhuma conexão pode ser estabelecida com o appium durante '" + defaultWaitMilis + "'ms, abortando testes.."));
                }


                cmd = Instances.commandEx("adb devices -l");
                System.out.println("cmd: " + cmd);
                int quantidadeDeDevices = cmd.size();
                List<String> devicesAnteriores = cmd;
                if (cmd.get(1).trim().length() == 0) {
                    getReportClassInstance().stepPass("Nenhum device estava aberto, iniciando o device '" + androidDeviceName + "'");
                    String androidNameInvoke = androidDeviceName.trim().replaceAll(" ", "_");
                    String androidpath = System.getenv("ANDROID_HOME");
                    String androidTools = androidpath + "\\platform-tools\\";


                    cmd = commandEx("emulator -list-avds");
                    boolean existe = false;
                    for (String linha : cmd) {
                        System.out.println("linha " + linha);
                        if (linha.contains(androidNameInvoke)) {
                            existe = true;
                            break;
                        }
                    }
                    if (!existe) {
                        getReportClassInstance().stepFatal(new Throwable("O device '" + androidDeviceName + "' não existe no android manager virtual devices, abortando testes.."));
                    } else {
                        new Thread(() -> commandEx("emulator -avd " + androidNameInvoke)).start();
                    }
                    boolean ligou = false;
                    long tempoMaximoLocal = 300000;
                    while (true) {
                        cmd = commandEx("adb devices -l");
                        System.out.println("cmd: " + cmd);
                        System.out.println("tempo restante: " + tempoMaximoLocal);
                        if (cmd.size() > quantidadeDeDevices) {
                            for (String linha : cmd) {
                                boolean eraODeviceAnterior = false;
                                for (String linhaDevicesAnteriores : devicesAnteriores) {
                                    if (linhaDevicesAnteriores.equals(linha)) {
                                        eraODeviceAnterior = true;
                                        break;
                                    }
                                }
                                if (!eraODeviceAnterior && linha.contains("device product")) {
                                    ligou = true;
                                    break;
                                }
                            }
                        }
                        if (ligou) {
                            break;
                        }
                        getSleepWebClassInstance().until(100);
                        tempoMaximoLocal = tempoMaximoLocal - 100;
                        if (tempoMaximoLocal <= 0) {
                            getReportClassInstance().stepFatal(new Throwable("O device não terminou de iniciar após '" + defaultWaitMilis + "'ms, abortando testes;;"));
                        }
                    }
                }
                try {
                    androidDriver = new AndroidDriver<>(new URL(getAndroidUrl()), getAndroidDesiredCapabilities());
                } catch (SessionNotCreatedException e) {
                    System.out.println("O device estava ligado, mas ainda estava iniciando...");
                    long tempoMaximoLocal = 300000;
                    while (true) {
                        long tempoInicial = Calendar.getInstance().getTimeInMillis();
                        System.out.println("tempo restante: " + tempoMaximoLocal);
                        try {
                            androidDriver = new AndroidDriver<>(new URL(getAndroidUrl()), getAndroidDesiredCapabilities());
                            break;
                        } catch (SessionNotCreatedException ignored) {
                        }
                        Instances.getScreenshotClassInstance().print();
                        getReportClassInstance().stepPass("Tentativa de conexão sem sucesso, tentando novamente..");
                        long tempoFinal = Calendar.getInstance().getTimeInMillis();
                        long diferenca = tempoFinal - tempoInicial;
                        tempoMaximoLocal = tempoMaximoLocal - diferenca;
                        if (tempoMaximoLocal <= 0) {
                            getReportClassInstance().stepFatal(new Throwable("O device não terminou de iniciar após '" + defaultWaitMilis + "'ms, abortando testes;;"));
                        }
                    }
                }
                androidLastDeviceName = androidDeviceName;
                androidLastUdid = androidUdid;
                androidLastPlatformName = androidPlatformName;
                androidLastPlatformVersion = androidPlatformVersion;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }

    public static org.openqa.selenium.WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver() {
        if (webDriver == null || webDriver.toString().contains("null")) {
            if (webdriverType.equals(chrome)) {
                createChrome();
            } else if (webdriverType.equals(internetExplorer)) {
                createInternetExplorer();
            } else if (webdriverType.equals(phantomjs)) {
                createPhantomJs();
            } else {
                createFireFox();
            }
        }
    }

    private static void createFireFox() {

    }

    private static void createPhantomJs() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setJavascriptEnabled(true);
        desiredCapabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "src/test/resources/drivers/phantomjs.exe");
        desiredCapabilities.setCapability("takesScreenshot", true);
        String [] phantomJsArgs = {"--web-security=no", "--ignore-ssl-errors=yes"};
        desiredCapabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, phantomJsArgs);
        webDriver = new PhantomJSDriver(desiredCapabilities);
        commonsDriver();
        webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
    }

    private static void createInternetExplorer() {
        System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
        InternetExplorerOptions options = new InternetExplorerOptions();
        if (getCleanSection()) {
            options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        }
        options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        options.setCapability(InternetExplorerDriver.ELEMENT_SCROLL_BEHAVIOR, true);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
        webDriver = new InternetExplorerDriver(options);
        commonsDriver();
        webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
    }

    private static void createChrome() {
        File path = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\downloads\\");

        try {
            FileUtils.deleteDirectory(path);
        } catch (IOException ignored) {

        }
        path.mkdirs();
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", path.getPath());
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--allow-insecure-localhost");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--incognito");
        if (getHeadless() || System.getProperty("user.name").contains("ARTIT") || System.getProperty("user.name").contains("automacao")) {
            options.addArguments("--headless");
        }
        options.addArguments("--window-size=" + resolution[0] + "," + resolution[1] + "");
        webDriver = new ChromeDriver(options);
        commonsDriver();
        setWebdriverPageNumber(0);
        webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
    }

    private static void commonsDriver() {
        webDriver.manage().window().setPosition(new Point(0, 0));
        webDriver.manage().window().setSize(new Dimension(resolution[0], resolution[1]));
        if (maximized) {
            webDriver.manage().window().maximize();
        }
    }

    public static void killWebDriver() {
        if (webDriver != null) {
            webDriver.quit();
        }
        if (androidDriver != null) {
            androidDriver.quit();
        }
    }

    public static List<String> commandEx(String command) {
        List<String> resp = new ArrayList<String>();
        Process cmdProc;
        try {
            cmdProc = Runtime.getRuntime().exec("cmd /c " + command);
            BufferedReader stdoutReader = new BufferedReader(
                new InputStreamReader(cmdProc.getInputStream()));
            String line;
            while ((line = stdoutReader.readLine()) != null) {
                resp.add(line);
            }
            BufferedReader stderrReader = new BufferedReader(
                    new InputStreamReader(cmdProc.getErrorStream()));
            while ((line = stderrReader.readLine()) != null) {
                resp.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resp;
    }

    public static SleepScreen getSleepScreenClassInstance() {
        if (sleepScreenClassInstance == null) {
            sleepScreenClassInstance = new SleepScreen();
        }
        return sleepScreenClassInstance;
    }

    public static JRobot getjRobotClassInstance() {
        if (jRobotClassInstance == null) {
            jRobotClassInstance = new JRobot();
        }
        return jRobotClassInstance;
    }

    public static GetterActionsAndroid getGetterActionsAndroidClassInstance() {
        if (getterActionsAndroidClassInstance == null) {
            getterActionsAndroidClassInstance = new GetterActionsAndroid();
        }
        return getterActionsAndroidClassInstance;
    }

    public static ActionsScreen getActionsScreenClassInstance() {
        if (actionsScreenClassInstance == null) {
            actionsScreenClassInstance = new ActionsScreen();
        }
        return actionsScreenClassInstance;
    }

    public static SendsScreen getSendsScreenClassInstance() {
        if (sendsScreenClassInstance == null) {
            sendsScreenClassInstance = new SendsScreen();
        }
        return sendsScreenClassInstance;
    }

    public static MoveScreen getMoveScreenClassInstance() {
        if (moveScreenClassInstance == null) {
            moveScreenClassInstance = new MoveScreen();
        }
        return moveScreenClassInstance;
    }

    public static ClicksScreen getClicksScreenClassInstance() {
        if (clicksScreenClassInstance == null) {
            clicksScreenClassInstance = new ClicksScreen();
        }
        return clicksScreenClassInstance;
    }

    public static support.android.adriver.AndroidDriver getAndroidDriverClassInstance() {
        if (androidDriverClassInstance == null) {
            androidDriverClassInstance = new support.android.adriver.AndroidDriver();
        }
        return androidDriverClassInstance;
    }

    public static ScrollAndroid getScrollAndroidClassInstance() {
        if (scrollAndroidClassInstance == null) {
            scrollAndroidClassInstance = new ScrollAndroid();
        }
        return scrollAndroidClassInstance;
    }

    public static ExceptionalsAndroid getExceptionalsAndroidClassInstance() {
        if (exceptionalsAndroidClassInstance == null) {
            exceptionalsAndroidClassInstance = new ExceptionalsAndroid();
        }
        return exceptionalsAndroidClassInstance;
    }

    public static AlertsAndroid getAlertsAndroidClassInstance() {
        if (alertsAndroidClassInstance == null) {
            alertsAndroidClassInstance = new AlertsAndroid();
        }
        return alertsAndroidClassInstance;
    }

    public static SendsAndroid getSendsAndroidClassInstance() {
        if (sendsAndroidClassInstance == null) {
            sendsAndroidClassInstance = new SendsAndroid();
        }
        return sendsAndroidClassInstance;
    }

    public static Execute getExecuteClassInstance() {
        if (executeClassInstance == null) {
            executeClassInstance = new Execute();
        }
        return executeClassInstance;
    }

    public static ActionsAndroid getActionsAndroidClassInstance() {
        if (actionsAndroidClassInstance == null) {
            actionsAndroidClassInstance = new ActionsAndroid();
        }
        return actionsAndroidClassInstance;
    }

    public static SetCapabilities getSetCapabilitiesClassInstance() {
        if (setCapabilitiesClassInstance == null) {
            setCapabilitiesClassInstance = new SetCapabilities();
        }
        return setCapabilitiesClassInstance;
    }

    public static support.android.adriver.Capabilities getCapabilitiesClassInstance() {
        if (capabilitiesClassInstance == null) {
            capabilitiesClassInstance = new support.android.adriver.Capabilities();
        }
        return capabilitiesClassInstance;
    }

    public static Screen getScreenClassInstance() {
        if (screenClassInstance == null) {
            screenClassInstance = new Screen();
        }
        return screenClassInstance;
    }

    public static Report getReportClassInstance() {
        if (reportClassInstance == null) {
            reportClassInstance = new Report();
        }
        return reportClassInstance;
    }

    public static Screenshot getScreenshotClassInstance() {
        if (screenshotClassInstance == null) {
            screenshotClassInstance = new Screenshot();
        }
        return screenshotClassInstance;
    }

    public static Remover getRemoverClassInstance() {
        if (removerClassInstance == null) {
            removerClassInstance = new Remover();
        }
        return removerClassInstance;
    }

    public static Adder getAdderClassInstance() {
        if (adderClassInstance == null) {
            adderClassInstance = new Adder();
        }
        return adderClassInstance;
    }

    public static BrowserTypes getBrowserTypesClassInstance() {
        if (browserTypesClassInstance == null) {
            browserTypesClassInstance = new BrowserTypes();
        }
        return browserTypesClassInstance;
    }

    public static DriverOptions getDriverOptionsClassInstance() {
        if (driverOptionsClassInstance == null) {
            driverOptionsClassInstance = new DriverOptions();
        }
        return driverOptionsClassInstance;
    }

    public static IEOptions getIEOptionsClassInstance() {
        if (iEOptionsClassInstance == null) {
            iEOptionsClassInstance = new IEOptions();
        }
        return iEOptionsClassInstance;
    }

    public static ChromeCapabilities getChromeCapabilitiesClassInstance() {
        if (chromeCapabilitiesClassInstance == null) {
            chromeCapabilitiesClassInstance = new ChromeCapabilities();
        }
        return chromeCapabilitiesClassInstance;
    }

    public static SetterConfig getSetterConfigClassInstance() {
        if (setterConfigClassInstance == null) {
            setterConfigClassInstance = new SetterConfig();
        }
        return setterConfigClassInstance;
    }

    public static GetterConfig getGetterConfigClassInstance() {
        if (getterConfigClassInstance == null) {
            getterConfigClassInstance = new GetterConfig();
        }
        return getterConfigClassInstance;
    }

    public static GetterComboBox getGetterComboBoxClassInstance() {
        if (getterComboBoxClassInstance == null) {
            getterComboBoxClassInstance = new GetterComboBox();
        }
        return getterComboBoxClassInstance;
    }

    public static SetterComboBox getSetterComboBoxClassInstance() {
        if (setterComboBoxClassInstance == null) {
            setterComboBoxClassInstance = new SetterComboBox();
        }
        return setterComboBoxClassInstance;
    }

    public static GetterPopUps getGetterPopUpsClassInstance() {
        if (getterPopUpsClassInstance == null) {
            getterPopUpsClassInstance = new GetterPopUps();
        }
        return getterPopUpsClassInstance;
    }

    public static LocatorAndroid getLocatorAndroidClassInstance() {
        if (locatorAndroidClassInstance == null) {
            locatorAndroidClassInstance = new LocatorAndroid();
        }
        return locatorAndroidClassInstance;
    }

    public static LocatorWeb getLocatorWebClassInstance() {
        if (locatorWebClassInstance == null) {
            locatorWebClassInstance = new LocatorWeb();
        }
        return locatorWebClassInstance;
    }

    public static GetterActionsWeb getFindGetterClassInstance() {
        if (findGetterActionsWebClassInstance == null) {
            findGetterActionsWebClassInstance = new GetterActionsWeb();
        }
        return findGetterActionsWebClassInstance;
    }

    public static ComboBox getComboBoxClassInstance() {
        if (comboBoxClassInstance == null) {
            comboBoxClassInstance = new ComboBox();
        }
        return comboBoxClassInstance;
    }

    public static ClicksWeb getClicksClassInstance() {
        if (clicksWebClassInstance == null) {
            clicksWebClassInstance = new ClicksWeb();
        }
        return clicksWebClassInstance;
    }

    public static SendsWeb getSendsClassInstance() {
        if (sendsWebClassInstance == null) {
            sendsWebClassInstance = new SendsWeb();
        }
        return sendsWebClassInstance;
    }

    public static Db getDbClassInstance() {
        if (dbClassInstance == null) {
            dbClassInstance = new Db();
        }
        return dbClassInstance;
    }

    public static TypeDB getTypeDBClassInstance() {
        if (typeDBClassInstance == null) {
            typeDBClassInstance = new TypeDB();
        }
        return typeDBClassInstance;
    }

    public static SetDb getSetDbClassInstance() {
        if (setDbClassInstance == null) {
            setDbClassInstance = new SetDb();
        }
        return setDbClassInstance;
    }

    public static Datter getDatterClassInstance() {
        if (datterClassInstance == null) {
            datterClassInstance = new Datter();
        }
        return datterClassInstance;
    }

    public static ActionsWeb getActionsClassInstance() {
        if (actionsWebClassInstance == null) {
            actionsWebClassInstance = new ActionsWeb();
        }
        return actionsWebClassInstance;
    }

    public static WebDriver getWebDriverClassInstance() {
        if (webDriverClassInstance == null) {
            webDriverClassInstance = new WebDriver();
        }
        return webDriverClassInstance;
    }

    public static Converter getConverterClassInstance() {
        if (converterClassInstance == null) {
            converterClassInstance = new Converter();
        }
        return converterClassInstance;
    }

    public static Log getLogClassInstance() {
        if (logClassInstance == null) {
            logClassInstance = new Log();
        }
        return logClassInstance;
    }

    public static ScrollWeb getScrollWebClassInstance() {
        if (scrollWebClassInstance == null) {
            scrollWebClassInstance = new ScrollWeb();
        }
        return scrollWebClassInstance;
    }

    public static PopUps getPopUpsClassInstance() {
        if (popUpsClassInstance == null) {
            popUpsClassInstance = new PopUps();
        }
        return popUpsClassInstance;
    }

    public static SleepAndroid getSleepAndroidClassInstance() {
        if (sleepAndroidClassInstance == null) {
            sleepAndroidClassInstance = new SleepAndroid();
        }
        return sleepAndroidClassInstance;
    }

    public static SleepWeb getSleepWebClassInstance() {
        if (sleepWebClassInstance == null) {
            sleepWebClassInstance = new SleepWeb();
        }
        return sleepWebClassInstance;
    }

    public static Error getErrorClassInstance() {
        if (errorClassInstance == null) {
            errorClassInstance = new Error();
        }
        return errorClassInstance;
    }

    public static FramesWeb getFramesWebClassInstance() {
        if (framesWebClassInstance == null) {
            framesWebClassInstance = new FramesWeb();
        }
        return framesWebClassInstance;
    }

    public static ExceptionalsWeb getExceptionalsWebClassInstance() {
        if (exceptionalsWebClassInstance == null) {
            exceptionalsWebClassInstance = new ExceptionalsWeb();
        }
        return exceptionalsWebClassInstance;
    }

    public static AssertThat getAssertThatClassInstance() {
        if (assertThatClassInstance == null) {
            assertThatClassInstance = new AssertThat();
        }
        return assertThatClassInstance;
    }

    public static BodyREST getBodyRESTClassInstance() {
        if (bodyRESTClassInstance == null) {
            bodyRESTClassInstance = new BodyREST();
        }
        return bodyRESTClassInstance;
    }

    public static HeadersREST getHeadersRESTClassInstance() {
        if (headersRESTClassInstance == null) {
            headersRESTClassInstance = new HeadersREST();
        }
        return headersRESTClassInstance;
    }

    public static ParametersREST getParametersRESTClassInstance() {
        if (parametersRESTClassInstance == null) {
            parametersRESTClassInstance = new ParametersREST();
        }
        return parametersRESTClassInstance;
    }

    public static ResponseBodyREST getResponseBodyRESTClassInstance() {
        if (responseBodyRESTClassInstance == null) {
            responseBodyRESTClassInstance = new ResponseBodyREST();
        }
        return responseBodyRESTClassInstance;
    }

    public static ResponseResponseTimeREST getResponseResponseTimeRESTClassInstance() {
        if (responseResponseTimeRESTClassInstance == null) {
            responseResponseTimeRESTClassInstance = new ResponseResponseTimeREST();
        }
        return responseResponseTimeRESTClassInstance;
    }

    public static ResponseREST getResponseRESTClassInstance() {
        if (responseRESTClassInstance == null) {
            responseRESTClassInstance = new ResponseREST();
        }
        return responseRESTClassInstance;
    }

    public static ResponseStatusREST getResponseStatusRESTClassInstance() {
        if (responseStatusRESTClassInstance == null) {
            responseStatusRESTClassInstance = new ResponseStatusREST();
        }
        return responseStatusRESTClassInstance;
    }

    public static SendREST getSendRESTClassInstance() {
        if (sendRESTClassInstance == null) {
            sendRESTClassInstance = new SendREST();
        }
        return sendRESTClassInstance;
    }

    public static TypeOfREST getTypeOfRESTClassInstance() {
        if (typeOfRESTClassInstance == null) {
            typeOfRESTClassInstance = new TypeOfREST();
        }
        return typeOfRESTClassInstance;
    }

    public static String getRestLastURI() {
        return restLastURI;
    }

    public static void setRestLastURI(String restLastURI) {
        Instances.restLastURI = restLastURI;
    }

    public static String getRestLastEndPoint() {
        return restLastEndPoint;
    }

    public static void setRestLastEndPoint(String restLastEndPoint) {
        Instances.restLastEndPoint = restLastEndPoint;
    }

    public static List<JSONObject> getRestLastResponse() {
        return restLastResponse;
    }

    public static void setRestLastResponse(List<JSONObject> restLastResponse) {
        Instances.restLastResponse = restLastResponse;
    }

    public static int getRestLastStatus() {
        return restLastStatus;
    }

    public static void setRestLastStatus(int restLastStatus) {
        Instances.restLastStatus = restLastStatus;
    }

    public static int getRestLastResponseTime() {
        return restLastResponseTime;
    }

    public static void setRestLastResponseTime(int restLastResponseTime) {
        Instances.restLastResponseTime = restLastResponseTime;
    }

    public static HashMap<String, String> getRestLastParameters() {
        return restLastParameters;
    }

    public static void putRestLastParameters(String key, String value){
        restLastParameters.put(key, value);
    }

    public static void setRestLastParameters(HashMap<String, String> restLastParameters) {
        Instances.restLastParameters = restLastParameters;
    }

    public static HashMap<String, String> getRestLastHeaders() {
        return restLastHeaders;
    }

    public static void putRestLastHeaders(String key, String value){
        restLastHeaders.put(key, value);
    }

    public static void setRestLastHeaders(HashMap<String, String> restLastHeaders) {
        Instances.restLastHeaders = restLastHeaders;
    }

    public static String getRestLastToken() {
        return restLastToken;
    }

    public static void setRestLastToken(String restLastToken) {
        Instances.restLastToken = restLastToken;
    }

    public static String getRestLastTypeOfRequest() {
        return restLastTypeOfRequest;
    }

    public static void setRestLastTypeOfRequest(String restLastTypeOfRequest) {
        Instances.restLastTypeOfRequest = restLastTypeOfRequest;
    }

    public static JSONObject getRestLastBody() {
        return restLastBody;
    }

    public static void setRestLastBody(JSONObject restLastBody) {
        Instances.restLastBody = restLastBody;
    }

    public static String getAndroidDeviceName() {
        return androidDeviceName;
    }

    public static void setAndroidDeviceName(String androidDeviceName) {
        Instances.androidDeviceName = androidDeviceName;
    }

    public static String getAndroidUdid() {
        return androidUdid;
    }

    public static void setAndroidUdid(String androidUdid) {
        Instances.androidUdid = androidUdid;
    }

    public static String getAndroidPlatformName() {
        return androidPlatformName;
    }

    public static void setAndroidPlatformName(String androidPlatformName) {
        Instances.androidPlatformName = androidPlatformName;
    }

    public static String getAndroidPlatformVersion() {
        return androidPlatformVersion;
    }

    public static void setAndroidPlatformVersion(String androidPlatformVersion) {
        Instances.androidPlatformVersion = androidPlatformVersion;
    }

    public static String getAndroidSkipUnlock() {
        return androidSkipUnlock;
    }

    public static void setAndroidSkipUnlock(String androidSkipUnlock) {
        Instances.androidSkipUnlock = androidSkipUnlock;
    }

    public static String getAndroidAppPackage() {
        return androidAppPackage;
    }

    public static void setAndroidAppPackage(String androidAppPackage) {
        Instances.androidAppPackage = androidAppPackage;
    }

    public static String getAndroidAppActivity() {
        return androidAppActivity;
    }

    public static void setAndroidAppActivity(String androidAppActivity) {
        Instances.androidAppActivity = androidAppActivity;
    }

    public static String getAndroidUrl() {
        return androidUrl;
    }

    public static void setAndroidUrl(String androidUrl) {
        Instances.androidUrl = androidUrl;
    }

    public static String getJenkinsPath() {
        return jenkinsPath;
    }

    public static List<List<Object>> getTabName() {
        return tabName;
    }

    public static void setTabName(List<List<Object>> tabName) {
        Instances.tabName = tabName;
    }

    public static List<List<Object>> getTabNameClosed() {
        return tabNameClosed;
    }

    public static void setTabNameClosed(List<List<Object>> tabNameClosed) {
        Instances.tabNameClosed = tabNameClosed;
    }

    public static LinkedHashMap<String, String> getLocator() {
        return locator;
    }

    public static void setLocator(LinkedHashMap<String, String> locator) {
        Instances.locator = locator;
    }

    public static Boolean getSoftAssert() {
        return softAssert;
    }

    public static void setSoftAssert(Boolean softAssert) {
        Instances.softAssert = softAssert;
    }

    public static String getWebLastXpath() {
        return webLastXpath;
    }

    public static void setWebLastXpath(String xpath) {
        Instances.webLastXpath = xpath;
        Instances.setIsAvailable(false);
        Instances.getLocatorWebClassInstance().locate();
    }

    public static float getScreenLastPrecision() {
        return screenLastPrecision;
    }

    public static void setScreenLastPrecision(float screenLastPrecision) {
        Instances.screenLastPrecision = screenLastPrecision;
    }

    public static String getScreenLastLocator() {
        return screenLastXpath;
    }

    public static void setScreenLastXpath(String screenLastXpath) {
        Instances.screenLastXpath = screenLastXpath;
    }

    public static String getAndroidLastXpath() {
        return androidLastXpath;
    }

    public static void setAndroidLastXpath(String xpath) {
        Instances.androidLastXpath = xpath;
        Instances.getLocatorAndroidClassInstance().locate();
    }

    public static List<MobileElement> getAndroidLastElements() {
        return androidLastElements;
    }

    public static void setAndroidLastElements(List<MobileElement> androidLastElements) {
        System.out.println("last elements");
        Instances.androidLastElements = androidLastElements;
    }

    public static List<WebElement> getWebLastElements() {
        return webLastElements;
    }

    static void setWebLastElements(List<WebElement> list) {
        webLastElements = list;
    }

    public static boolean getTestsKilled() {
        return testsKilled;
    }

    public static void setTestsKilled(boolean killed) {
        testsKilled = killed;
    }

    public static long getExecutionActionTimer() {
        long time = Calendar.getInstance().getTimeInMillis() - executionActionTimer;
        executionActionTimer = Calendar.getInstance().getTimeInMillis();
        return time;
    }

    public static void setExecutionActionTimer(long executionActionTimer) {
        Instances.executionActionTimer = executionActionTimer;
    }

    public static boolean getEach() {
        return each;
    }

    public static void setEach(boolean each) {
        Instances.each = each;
    }

    public static boolean getSlow() {
        return slow;
    }

    public static void setSlow(boolean slow) {
        Instances.slow = slow;
    }

    public static int getDefaultWaitMilis() {
        return defaultWaitMilis;
    }

    public static void setDefaultWaitMilis(int defaultWaitMilis) {
        Instances.defaultWaitMilis = defaultWaitMilis;
    }

    public static void setDefaultWaitMilisBackUp() {
        Instances.defaultWaitMilis = Instances.defaultWaitMilisBackUp;
    }

    private static boolean getHeadless() {
        return headless;
    }

    public static void setHeadless(boolean headless) {
        Instances.headless = headless;
    }

    private static boolean getCompability() {
        return compability;
    }

    public static void setCompability(boolean compability) {
        Instances.compability = compability;
    }

    private static boolean getCleanSection() {
        return cleanSection;
    }

    public static void setCleanSection(boolean cleanSection) {
        Instances.cleanSection = cleanSection;
    }

    private static boolean getMaximized() {
        return maximized;
    }

    public static void setMaximized(boolean maximized) {
        Instances.maximized = maximized;
    }

    public static void setResolution(int width, int height) {
        Instances.resolution[0] = width;
        Instances.resolution[1] = height;
    }

    public static int[] getResolution() {
        return Instances.resolution;
    }

    public static String getWebdriverType() {
        return webdriverType;
    }

    public static void setWebdriverType(String webdriverType) {
        Instances.webdriverType = webdriverType;
    }

    public static Date getDateClassInstance() {
        if (dateClassInstance == null) {
            dateClassInstance = new Date();
        }
        return dateClassInstance;
    }

    public static void setDateClassInstance(Date dateClassInstance) {
        Instances.dateClassInstance = dateClassInstance;
    }

    public static String getDetailedHtmlReportFileLoc() {
        return detailedHtmlReportFileLoc;
    }

    static String getJenkinsEvidencesPath() {
        return jenkinsEvidencesPath;
    }

    public static String getScreenLastLocatorLog() {

        String r = "[Mapa de log não definido]";
        if (locator != null) {
            if (locator.get(Instances.getScreenLastLocator()) == null) {
                r = "[Log do localizador não definido]";
            } else {
                r = locator.get(Instances.getScreenLastLocator());
            }
        } else {
            if (getScreenLastLog() != null) {
                r = "[Modelo antigo] " + getScreenLastLog();
            }
        }
        return r;
    }

    public static String getAndroidLastXpathLog() {

        String r = "[Mapa de log não definido]";
        if (locator != null) {
            if (locator.get(Instances.getAndroidLastXpath()) == null) {
                r = "[Log do xpath não definido]";
            } else {
                r = locator.get(Instances.getAndroidLastXpath());
            }
        } else {
            if (getAndroidLastLog() != null) {
                r = "[Modelo antigo] " + getAndroidLastLog();
            }
        }
        return r;
    }

    public static String getWebLastXpathLog() {

        String r = "[Mapa de log não definido]";
        if (locator != null) {
            if (locator.get(Instances.getWebLastXpath()) == null) {
                r = "[Log do xpath não definido]";
            } else {
                r = locator.get(Instances.getWebLastXpath());
            }
        } else {
            if (getWebLastLog() != null) {
                r = "[Modelo antigo] " + getWebLastLog();
            }
        }
        return r;
    }

    static String getScreenShotLocation() {
        return screenShotLocation;
    }

    static void setScreenShotLocation(String screenShotLocation) {
        Instances.screenShotLocation = screenShotLocation;
    }

    public static String getDbname() {
        return dbname;
    }

    public static void setDbname(String dbname) {
        Instances.dbname = dbname;
    }

    public static String getDbpassword() {
        return dbpassword;
    }

    public static void setDbpassword(String password) {
        Instances.dbpassword = password;
    }

    public static String getDbadress() {
        return dbadress;
    }

    public static void setDbadress(String dbadress) {
        Instances.dbadress = dbadress;
    }

    public static String getDbport() {
        return dbport;
    }

    public static void setDbport(String dbport) {
        Instances.dbport = dbport;
    }

    public static String getDbtnsnames() {
        return dbtnsnames;
    }

    public static void setDbtnsnames(String tnsnames) {
        Instances.dbtnsnames = tnsnames;
    }

    public static String getDbtype() {
        return dbtype;
    }

    public static void setDbtype(String dbtype) {
        Instances.dbtype = dbtype;
    }

    public static String getDbuser() {
        return dbuser;
    }

    public static void setDbuser(String user) {
        Instances.dbuser = user;
    }

    public static void setProduct(String product) {
        Instances.product = product;
    }

    public static ExtentReports getExtent() {
        return extent;
    }

    public static ExtentTest getFeatureSection() {
        return featureSection;
    }

    public static ExtentTest getScenarioSection() {
        return scenarioSection;
    }

    public static ExtentTest getBddSection() {
        return bddSection;
    }

    public static String getScenario() {
        return scenario;
    }

    public static void setScenario(String scenario) {
        Instances.scenario = scenario;
    }

    public static String getFeature() {
        return feature;
    }

    public static void setFeature(String feature) {
        Instances.feature = feature;
    }

    static String getStep() {
        return step;
    }

    static void setStep(String step) {
        Instances.step = step;
    }

    public static void setAuthor(String author) {
        Instances.author = author;
    }

    public static void setEnvironment(String environment) {
        Instances.environment = environment;
    }

    public static void setCategory(String category) {
        Instances.category = category;
    }

    public static void createFeatureSection() {
        if (extent != null) {
            featureSection = extent.createTest(feature);
        }
    }

    public static void createScenarioSection() {
        if (extent != null) {
            scenarioSection = featureSection.createNode(scenario + "" +
                    "</span><br>" +
                    "<span class='author label'>Autor: <span style='font-weight:normal'>" + author + "</span></span></br>" +
                    "<span class='author label'>Categoria: <span style='font-weight:normal'>" + category + "</span></span></br>" +
                    "<span class='author label'>Ambiente: <span style='font-weight:normal'>" + environment + "</span>");

            scenarioSection.assignAuthor(author);
            scenarioSection.assignCategory(category);
            scenarioSection.assignDevice(environment);
        }
    }

    static void createBddSection(String bdd) {
        if (extent != null) {
            bddSection = scenarioSection.createNode(bdd);
        }
    }

    public static void createInstance() {
        if (extent == null) {
            executionStartTimer = Calendar.getInstance().getTimeInMillis();
            File pastaAnexo = new File(jenkinsAnexosPath);
            System.setProperty("file.encoding", "UTF-8");
            Field charset = null;
            try {
                charset = Charset.class.getDeclaredField("defaultCharset");
                charset.setAccessible(true);
                charset.set(null, null);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }

            boolean o = pastaAnexo.mkdirs();
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(detailedHtmlReportFileLoc);
            htmlReporter.config().setTheme(Theme.STANDARD);
            htmlReporter.config().setDocumentTitle("Relatório de Testes - " + product);
            htmlReporter.config().setEncoding("utf-8");
            htmlReporter.config().setReportName("Relatório de Testes - " + product);
            htmlReporter.config().setTimeStampFormat("yyyy/MM/dd - HH:mm:ss.SSS");
            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
            extent.setSystemInfo("Sistema operacional", System.getProperty("os.name"));
            extent.setSystemInfo("Arquitetura do OS", System.getProperty("os.arch"));
            extent.setSystemInfo("Versão do OS", System.getProperty("os.version"));
            extent.setSystemInfo("Java Version", System.getProperty("java.version"));
            extent.setSystemInfo("Usuário de execução", System.getProperty("user.name"));
            extent.setAnalysisStrategy(AnalysisStrategy.SUITE);
            featureSection = extent.createTest(feature);
            scenarioSection = featureSection.createNode(scenario + "" +
                    "</span><br>" +
                    "<span class='author label'>Autor: <span style='font-weight:normal'>" + author + "</span></span></br>" +
                    "<span class='author label'>Categoria: <span style='font-weight:normal'>" + category + "</span></span></br>" +
                    "<span class='author label'>Ambiente: <span style='font-weight:normal'>" + environment + "</span>");
            scenarioSection.assignAuthor(author);
            scenarioSection.assignCategory(category);
            scenarioSection.assignDevice(environment);
        }
    }

    public static void flushReportAndMongo() {
        File jenkinsPath = new File(jenkinsAnexosPath);
        if (!jenkinsPath.exists()) {
            jenkinsPath.mkdirs();
        }

        extent.flush();
        translateReport();
    }

    private static void translateReport() {
        String content = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(detailedHtmlReportFileLoc));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line).append("\n");
                line = br.readLine();
            }
            List<String> relatorioDivididoEmLinhas = Arrays.asList(sb.toString().split("\n"));
            int index = 0;
            for (String linha : relatorioDivididoEmLinhas) {
                if (linha.contains("<div class='left panel-name'>Suites</div>")) {
                    index = relatorioDivididoEmLinhas.indexOf(linha);
                    relatorioDivididoEmLinhas.set(index - 2, "<div class='col s12 m6 l6 np-h'>");
                }
                if (linha.contains("<div class='left panel-name'>Tests</div>")) {
                    index = relatorioDivididoEmLinhas.indexOf(linha);
                    relatorioDivididoEmLinhas.set(index - 2, "<div class='col s12 m6 l6 np-h'>");
                }
                if (linha.contains("<div class='left panel-name'>Test Methods</div>")) {
                    index = relatorioDivididoEmLinhas.indexOf(linha);
                    for (int i = -2; i <= 11; i++) {
                        relatorioDivididoEmLinhas.set(index + i, "");
                    }
                }
                if (linha.contains("Autor: ") && linha.contains("node-name")) {
                    index = relatorioDivididoEmLinhas.indexOf(linha);
                    String linhaReplace = relatorioDivididoEmLinhas.get(index + 8).replace("collapsible node-list", "collapsible-body collapsible node-list");
                    relatorioDivididoEmLinhas.set(index + 8, linhaReplace);
                }
            }
            sb = new StringBuilder();
            for (String linha : relatorioDivididoEmLinhas) {
                sb.append(linha).append("\n");
            }
            content = sb.toString();
            content = content.replace("<div class='left panel-name'>Suites</div>", "<div class='left panel-name'>Features</div>");
            content = content.replace(" suite(s) passed", " feature(s) passed");
            content = content.replace(" suite(s) failed, ", " feature(s) failed, ");

            content = content.replace("<div class='left panel-name'>Tests</div>", "<div class='left panel-name'>Scenarios</div>");
            content = content.replace(" test(s) passed", " scenario(s) passed");
            content = content.replace(" test(s) failed, ", " scenario(s) failed, ");


            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(detailedHtmlReportFileLoc, false), StandardCharsets.UTF_8))) {
                writer.write(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getMessageMoveScreen() {
        return messageMoveScreen;
    }

    public static String getMessageMoveScreenCoord() {
        return messageMoveScreenCoord;
    }

    public static String getMessageMoveScreenRelative() {
        return messageMoveScreenRelative;
    }

    public static String getLastTag() {
        return lastTag;
    }

    public static void setLastTag(String lastTag) {
        Instances.lastTag = lastTag;
    }

    public static String getMessageStepSkipped() {
        return messageStepSkipped;
    }

    public static String getMessageExecutionInterrupted() {
        return messageExecutionInterrupted;
    }

    public static String getMessageFailTests() {
        return messageFailTests;
    }

    public static String getMessageWarning() {
        return messageWarning;
    }

    public static String getMessageEnvironmentError() {
        return messageEnvironmentError;
    }

    public static String getMessageNumberTooLong() {
        return messageNumberTooLong;
    }

    public static String getMessageWaitDisapearStillHasElement() {
        return messageWaitDisapearStillHasElement;
    }

    public static String getMessageWaitAppearStillHasElement() {
        return messageWaitAppearStillHasElement;
    }

    public static String getMessageMapNotDefined() {
        return messageMapNotDefined;
    }

    public static String getMessageAssertEquals() {
        return messageAssertEquals;
    }

    public static String getMessageAssertContains() {
        return messageAssertContains;
    }

    public static String getMessageAssertStartsWith() {
        return messageAssertStartsWith;
    }

    public static String getMessageAssertEndsWith() {
        return messageAssertEndsWith;
    }

    public static String getMessageRESTStatusError() {
        return messageRESTStatusError;
    }

    public static String getMessageRESTStatusSuccess() {
        return messageRESTStatusSuccess;
    }

    public static String getMessageRESTResponseNull() {
        return messageRESTResponseNull;
    }

    public static String getMessageRESTResponseNotContains() {
        return messageRESTResponseNotContains;
    }

    public static String getMessageRESTResponseNotContainsString() {
        return messageRESTResponseNotContainsString;
    }

    public static String getMessageRESTResponseContains() {
        return messageRESTResponseContains;
    }

    public static String getMessageRESTResponseContainsString() {
        return messageRESTResponseContainsString;
    }

    public static String getMessageRESTResponseNotContainsResp() {
        return messageRESTResponseNotContainsResp;
    }

    public static String getMessageRESTResponseNotContainsStringResp() {
        return messageRESTResponseNotContainsStringResp;
    }

    public static String getMessageRESTResponseNotContainsKeyAndValueResp() {
        return messageRESTResponseNotContainsKeyAndValueResp;
    }

    public static String getMessageRESTResponseEquals() {
        return messageRESTResponseEquals;
    }

    public static String getMessageRESTResponseNotEquals() {
        return messageRESTResponseNotEquals;
    }

    public static String getMessageRESTResponseNotEquals2() {
        return messageRESTResponseNotEquals2;
    }

    public static String getMessageRESTResponseNotEqualsMessage() {
        return messageRESTResponseNotEqualsMessage;
    }

    public static String getMessageRESTResponseNotContainsKeyAndValue() {
        return messageRESTResponseNotContainsKeyAndValue;
    }

    public static String getMessageRESTResponseContainsKeyAndValue() {
        return messageRESTResponseContainsKeyAndValue;
    }

    public static String getMessageRESTResponseTimeLessThan() {
        return messageRESTResponseTimeLessThan;
    }

    public static String getMessageRESTResponseTimeOK() {
        return messageRESTResponseTimeOK;
    }

    public static String getMessageRESTSendRequest() {
        return messageRESTSendRequest;
    }

    public static String getMessageRESTSendParameter() {
        return messageRESTSendParameter;
    }

    public static String getMessageRESTSendHeader() {
        return messageRESTSendHeader;
    }

    public static String getMessageRESTSendToken() {
        return messageRESTSendToken;
    }

    public static String getMessageInterrupt() {
        return messageInterrupt;
    }

    public static String getMessageScreenshotForced() {
        return messageScreenshotForced;
    }

    public static String getMessageWaitAppear() {
        return messageWaitAppear;
    }

    public static String getMessageWaitAppearEach() {
        return messageWaitAppearEach;
    }

    public static String getMessageWaitDisapear() {
        return messageWaitDisapear;
    }

    public static String getMessageWaitDisapearEach() {
        return messageWaitDisapearEach;
    }

    public static String getMessageAssertFailEndsWith() {
        return messageAssertFailEndsWith;
    }

    public static String getMessageAssertFailStartsWith() {
        return messageAssertFailStartsWith;
    }

    public static String getMessageAssertFailContains() {
        return messageAssertFailContains;
    }

    public static String getMessageAssertFailEquals() {
        return messageAssertFailEquals;
    }

    public static String getMessageClear() {
        return messageClear;
    }

    public static String getMessageClick() {
        return messageClick;
    }

    public static String getMessageClickTwice() {
        return messageClickTwice;
    }

    public static String getMessageClickThrice() {
        return messageClickThrice;
    }

    public static String getMessageDoubleClick() {
        return messageDoubleClick;
    }

    public static String getMessageSend() {
        return messageSend;
    }

    public static String getMessageSendSlow() {
        return messageSendSlow;
    }

    public static String getMessageMove() {
        return messageMove;
    }

    public static String getMessageExists() {
        return messageExists;
    }

    public static String getMessageClickEach() {
        return messageClickEach;
    }

    public static String getMessageClearEach() {
        return messageClearEach;
    }

    public static String getMessageDoubleClickEach() {
        return messageDoubleClickEach;
    }

    public static String getMessageSendEach() {
        return messageSendEach;
    }

    public static String getMessageSendSlowEach() {
        return messageSendSlowEach;
    }

    public static String getMessageMoveEach() {
        return messageMoveEach;
    }

    public static String getMessageExistsEach() {
        return messageExistsEach;
    }

    public static String getMessageComboBoxText() {
        return messageComboBoxText;
    }

    public static String getMessageComboBoxValue() {
        return messageComboBoxValue;
    }

    public static String getMessageComboBoxValueEach() {
        return messageComboBoxValueEach;
    }

    public static String getMessageComboBoxTextEach() {
        return messageComboBoxTextEach;
    }

    public static String getMessageComboBoxIndex() {
        return messageComboBoxIndex;
    }

    public static String getMessageComboBoxIndexEach() {
        return messageComboBoxIndexEach;
    }

    public static String getMessageComboBoxGetSize() {
        return messageComboBoxGetSize;
    }

    public static String getMessageNavigate() {
        return messageNavigate;
    }
}
