package me.alb_i986.selenium.forbes.lib.gui.pages.components;

import org.apache.log4j.Logger;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public abstract class PageTestBase {
	
	protected static final Logger logger = Logger.getLogger(PageTestBase.class);
	
	@Rule
	public TestWatcher watchman = new TestWatcher() {
		@Override
		protected void failed(Throwable e, Description description) {
			super.failed(e, description);
			logger.info("END: FAILED test " + description.getMethodName());
		}

		@Override
		protected void succeeded(Description description) {
			super.succeeded(description);
			logger.info("END: PASSED test " + description.getMethodName());
		}

		@Override
		protected void starting(Description description) {
			super.starting(description);
			logger.info("BEGIN test " + description.getMethodName());
		}
		
	};

}
