package karthik.www.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeNotes() {
        var course = courses["android_intents"]!!
        var note = NoteInfo(course, "Dynamic Intent Resolution", "Wow, intents allow components to be resolved at runtime")
        notes.add(note)

        course = courses["android_async"]!!
        note = NoteInfo(course, "Delegating Intents", "Wow, intents allow components to be resolved at runtime")
        notes.add(note)

        course = courses["java_lang"]!!
        note = NoteInfo(course, "Delegating Intents 2", "Wow, intents allow components to be resolved at runtime")
        notes.add(note)

        course = courses["java_core"]!!
        note = NoteInfo(course, "Delegating Intents 3", "Wow, intents allow components to be resolved at runtime")
        notes.add(note)

        course = courses["android_async"]!!
        note = NoteInfo(course, "Delegating Intents 4", "Wow, intents allow components to be resolved at runtime")
        notes.add(note)
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo("java_lang", "Java Fundamentals: The Java Language")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }


}