package com.shockrui.oj.judge;

import com.shockrui.oj.judge.judgeStrategy.DefaultJudgeStrategy;
import com.shockrui.oj.judge.judgeStrategy.JavaLanguageJudgeStrategy;
import com.shockrui.oj.judge.judgeStrategy.JudgeContext;
import com.shockrui.oj.judge.judgeStrategy.JudgeStrategy;
import com.shockrui.oj.model.dto.questionsubmit.JudgeInfo;
import org.springframework.stereotype.Service;

@Service
public class JudgeManger {

    JudgeInfo doJudge(JudgeContext judgeContext) {
        String language = judgeContext.getQuestionSubmit().getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if (language.equals("java")) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }


}
