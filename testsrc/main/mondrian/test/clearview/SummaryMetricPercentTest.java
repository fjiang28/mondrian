/*
// $Id$
// This software is subject to the terms of the Common Public License
// Agreement, available at the following URL:
// http://www.opensource.org/licenses/cpl.html.
// Copyright (C) 2007 Julian Hyde and others
// All Rights Reserved.
// You must accept the terms of that agreement to use this software.
//
*/
package mondrian.test.clearview;

import junit.framework.*;

import mondrian.test.*;

/**
 * <code>SummaryMetricPercentTest</code> is a test suite which tests scenarios 
 * of computing sums and percentages against the FoodMart database. 
 * MDX queries and their expected results are maintained separately in 
 * SummaryMetricPercentTest.ref.xml file.If you would prefer to see them as
 * inlined Java string literals, run ant target "generateDiffRepositoryJUnit"
 * and then use file SummaryMetricPercentTestJUnit.java which will be  
 * generated in this directory.
 *
 * @author Khanh Vu
 * @version $Id$
 */
public class SummaryMetricPercentTest extends ClearViewBase {

    public SummaryMetricPercentTest() {
        super();
    }

    public SummaryMetricPercentTest(String name) {
        super(name);
    }

    protected DiffRepository getDiffRepos() {
        return getDiffReposStatic();
    }

    private static DiffRepository getDiffReposStatic() {
        return DiffRepository.lookup(SummaryMetricPercentTest.class);
    }

    public static TestSuite suite() {
        return constructSuite(
            getDiffReposStatic(),
            SummaryMetricPercentTest.class);
    }

}

// End SummaryMetricPerCentTest.java