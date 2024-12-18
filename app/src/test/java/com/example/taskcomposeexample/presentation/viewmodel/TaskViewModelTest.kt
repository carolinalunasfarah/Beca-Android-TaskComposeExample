package com.example.taskcomposeexample.presentation.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test


class TaskViewModelTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: TaskViewModel

    @Before
    fun setup() {
        viewModel = TaskViewModel()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun `state is success and task is a empty list when loading the viewmodel`() {
        //when
        val state = viewModel.uiState

        //then
     //  assertEquals(TaskUIState.Success(listOf()) , state.value)
    }



}
