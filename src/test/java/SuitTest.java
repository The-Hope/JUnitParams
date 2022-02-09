import junitparams.*;
import junitparams.converters.NullableConverterTest;
import junitparams.custom.CustomParametersProviderTest;
import junitparams.custom.combined.CartesianTest;
import junitparams.custom.combined.CombinedParametersProviderTest;
import junitparams.file.FileParamsTest;
import junitparams.file.JsonFileParamsTest;
import junitparams.internal.JUnitParamsRunnerTest;
import junitparams.internal.ParameterisedTestClassRunnerTest;
import junitparams.internal.TestMethodTest;
import junitparams.internal.UtilsTest;
import junitparams.internal.parameters.toarray.SimpleIterableResultToArrayTest;
import junitparams.missingparams.MissingParametersTest;
import junitparams.naming.MacroSubstitutionNamingStrategyTest;
import junitparams.naming.NamingStrategyIsUsedByRunnerTest;
import junitparams.rules.TestWatcherDescriptionRuleTest;
import junitparams.usage.SamplesOfUsageTest;
import junitparams.usage.person_example.PersonTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * SuiteTest
 *
 * @author Sivan
 * @since 2021/8/18 11:28 下午
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        NullableConverterTest.class,
        CartesianTest.class,
        CombinedParametersProviderTest.class,
        CustomParametersProviderTest.class,
        SimpleIterableResultToArrayTest.class,
        JUnitParamsRunnerTest.class,
        ParameterisedTestClassRunnerTest.class,
        TestMethodTest.class,
        UtilsTest.class,
        MissingParametersTest.class,
        MacroSubstitutionNamingStrategyTest.class,
        NamingStrategyIsUsedByRunnerTest.class,
        TestWatcherDescriptionRuleTest.class,
        PersonTest.class,
        SamplesOfUsageTest.class,
        AssumptionsTest.class,
        BeforeAfterClassTest.class,
        CastingParamsTest.class,
        ClassesAsParamsTest.class,
        EnumsAsParamsTest.class,
        FileParamsTest.class,
        FilterableTest.class,
        IgnoringTest.class,
        InstantiatingTestClassOnceTest.class,
        IterableMethodTest.class,
        IteratorMethodTest.class,
        MethodAnnotationArgumentTest.class,
        MultipleParameterProvidersTest.class,
        NamedParametersAnnotationArgumentTest.class,
        NotSpecifiedParameters.class,
        NullValuesTest.class,
        ObjectStringificationTest.class,
        OverloadedTestMethodNameTest.class,
        ParametersConvertedWithPropertyEditorTest.class,
        ParametersForEnumTest.class,
        ParametersReaderForMethodTest.class,
        ParametersReaderProvidersTest.class,
        ParamsConverterTest.class,
        ParamsInAnnotationTest.class,
        RulesTest.class,
        SamplesOfUsageVerificationTest.class,
        SampleTestCase.class,
        SubclassTest.class,
        WrongArgumentsNumberTest.class,
        JsonFileParamsTest.class
})
public class SuitTest {
}
