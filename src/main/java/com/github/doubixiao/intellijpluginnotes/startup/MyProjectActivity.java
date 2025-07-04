package com.github.doubixiao.intellijpluginnotes.startup;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.ProjectActivity;
import com.intellij.psi.util.PsiModificationTracker;
import com.intellij.tasks.Task;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.Nullable;

public class MyProjectActivity implements ProjectActivity {
    private static final Logger LOG = Logger.getInstance(MyProjectActivity.class);

    @Override
    public @Nullable Object execute(@NotNull Project project, @NotNull Continuation<? super Unit> continuation) {
        LOG.warn("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.");
        return null;
    }

}