package proteintracker;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(GoodTestCategory.class)
@Categories.ExcludeCategory(BadCategory.class)
@Suite.SuiteClasses(TrackingServiceTest.class)

public class GoodTestsSuite {
}

