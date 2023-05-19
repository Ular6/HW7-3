package com.example.lesson7_3.presentation.notes

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import androidx.lifecycle.repeatOnLifecycle
import com.example.lesson7_3.presentation.utils.UIState
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class NotesFragment : Fragment() {

    private val viewModel: NotesViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupObservers()
    }

    private fun setupObservers() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.notesState.collect{
                    when (it) {
                        is UIState.Empty -> TODO()
                        is UIState.Error -> TODO()
                        is UIState.Loading -> TODO()
                        is UIState.Success -> TODO()
                    }
                }
            }
        }
    }
}